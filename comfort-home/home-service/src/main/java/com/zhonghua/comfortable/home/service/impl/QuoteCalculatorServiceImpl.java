package com.zhonghua.comfortable.home.service.impl;

import com.zhonghua.comfortable.home.domain.*;
import com.zhonghua.comfortable.home.service.ProductService;
import com.zhonghua.comfortable.home.service.QuoteCalculatorService;
import org.apache.commons.lang3.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-29 23:06
 * 报价计算器
 **/
@Service
public class QuoteCalculatorServiceImpl implements QuoteCalculatorService {
    private static final Logger logger = Logger.getLogger(QuoteCalculatorServiceImpl.class);

    @Autowired
    private ProductService productService;

    /**
     * 计算设备报价
     *
     * @param userProjectPrice
     * @return
     */
    @Override
    public UserProjectPrice calculatePrice(UserProjectPrice userProjectPrice) throws Exception {
        //读取产品定价信息
        List<DefProduct> productList = productService.getAllProductListWithPrice();
        //遍历用户选择的产品
        //用户房屋信息
        UserHouse userHouse = userProjectPrice.getUserHouse();
        //用户选择产品
        List<UserChooseProduct> chooseProductList = userProjectPrice.getChooseProductList();

        //计算价格信息
        calculateProductPrice(userHouse, chooseProductList, productList);

        //赋值计算后的报价
        userProjectPrice.setChooseProductList(chooseProductList);

        return userProjectPrice;
    }

    @Override
    public UserProjectPrice calculatePrice(UserHouse userHouse, List<Integer> productList) throws Exception {
        UserProjectPrice projectPrice = new UserProjectPrice();
        projectPrice.setUserHouse(userHouse);
        //读取产品定价信息
        List<DefProduct> defProducts = productService.getAllProductList();

        Map<Integer, UserChooseProduct> chooseProductMap = new HashMap<>();

        //将defproduct 转成Map;
        Map<Integer, DefProduct> productMap = parseProdcutList2Map(defProducts);
        for (Integer productId : productList) {
            if (!productMap.containsKey(productId)) {
                throw new Exception("您选择产品中存在未上线的产品，请选择其他产品！");
            }

            DefProduct product = productMap.get(productId);
            if (!chooseProductMap.containsKey(product.getModule())) {
                UserChooseProduct chooseProduct = new UserChooseProduct();
                chooseProduct.setModuleId(product.getModule());
                chooseProduct.setModuleName(product.getModuleName());
                chooseProduct.setProductIdList(new ArrayList<Integer>());
                chooseProductMap.put(product.getModule(), new UserChooseProduct());
            }
            chooseProductMap.get(product.getModule()).getProductIdList().add(productId);
        }

        List<UserChooseProduct> chooseProductList = new ArrayList<UserChooseProduct>();
        chooseProductList.addAll(chooseProductMap.values());
        projectPrice.setChooseProductList(chooseProductList);
        return calculatePrice(projectPrice);
    }

    /**
     * 计算总报价
     *
     * @param userHouse
     * @param chooseProductList
     * @param productList
     */
    private void calculateProductPrice(UserHouse userHouse, List<UserChooseProduct> chooseProductList, List<DefProduct> productList) throws Exception {
        //先读取用户的参数
        Integer A = userHouse.getType();//房屋类型  别墅 、复试、平层
        float B = userHouse.getUsableArea();//使用面积
        Integer C = userHouse.getParlorCount();//客厅数量
        Integer D = userHouse.getRoomCount();//卧室数量
        Integer E = userHouse.getLiveCount();//居住人数

        if (chooseProductList == null || chooseProductList.size() == 0) {
            logger.error("用户未选择任何产品无法生成报价！");
            return;
        }

        //将产品定义转换成Map对象,Key为产品ID
        Map<Integer, DefProduct> productMap = parseProdcutList2Map(productList);
        //便利用户选择的产品
        for (UserChooseProduct userChooseProduct : chooseProductList) {
            List<Integer> chooseProductIdList = userChooseProduct.getProductIdList();
            List<Float> chooseProductPrice = calculateModulePrice(A, B, C, D, E, chooseProductIdList, productMap);
            if (chooseProductPrice == null || chooseProductPrice.size() == 0) {
                throw new Exception("计算报价失败，请正确填写房屋信息！");
            }
            if (chooseProductPrice.size() == 1) {
                userChooseProduct.setCostMin(chooseProductPrice.get(0));
                userChooseProduct.setCostMax(chooseProductPrice.get(0));
            } else if (chooseProductPrice.size() > 1) {
                userChooseProduct.setCostMin(chooseProductPrice.get(0));
                userChooseProduct.setCostMax(chooseProductPrice.get(1));
            }
        }

    }

    /**
     * 计算选择产品的单价
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param chooseProductIdList
     * @param productMap
     * @return
     */
    private List<Float> calculateModulePrice(Integer a, float b, Integer c, Integer d, Integer e, List<Integer> chooseProductIdList, Map<Integer, DefProduct> productMap) throws Exception {
        if (chooseProductIdList == null && chooseProductIdList.size() == 0) {
            return null;
        }
        List<Float> priceRangeList = new ArrayList<>();
        //遍历选择产品
        Float maxPrice = 0f; // 最大
        Float minPrice = 0f;
        for (Integer prodId : chooseProductIdList) {
            if (!productMap.containsKey(prodId)) {
                throw new Exception("您选择产品暂未上线，请选择其他产品！");
            }
            DefProduct product = productMap.get(prodId);
            List<Float> productPrice = calculateProductPrice(a, b, c, d, e, product);
            if (productPrice == null || productPrice.size() == 0) {
                throw new Exception("您选择产品暂未上线，请选择其他产品！");
            }
            if (productPrice.size() == 1) {
                maxPrice += productPrice.get(0);
                minPrice += productPrice.get(0);
            } else {
                minPrice += productPrice.get(0);
                maxPrice += productPrice.get(1);
            }
        }
        priceRangeList.add(minPrice);
        priceRangeList.add(maxPrice);
        return priceRangeList;
    }

    /**
     * 计算单个产品的价格
     * UP ： 代表单价
     * TP : 总价
     * BP：基础价格
     *
     * @param A
     * @param B
     * @param C
     * @param D
     * @param product
     * @return
     */
    private List<Float> calculateProductPrice(Integer A, float B, Integer C, Integer D, Integer E, DefProduct product) throws Exception {
        if (StringUtils.isBlank(product.getFormula())) {
            throw new Exception("您选择产品暂未上线，请选择其他产品！");
        }

        String formula = product.getFormula();
        //范围获取数值，是单价
        if ("UP".equals(formula)) {
            return calculateProductPriceByRangeFromUP(B, product);
        }
        //范围取值，是总价
        if ("TP".equals(formula)) {
            return calculateProductPriceByRangeFromTP(B, product);
        }

        //计算公式
        if ("BP".equals(formula)) {
            return calculateProductPriceByRangeFromBP(B, product);
        }

        //存在配件计算公式
        if ("TP+PP".equals(formula)) {
            return calculateProductPriceByRangeFromTPPP(B, C, D, product);
        }
        return null;

    }

    /**
     * 计算价格
     * 总价 + 房间数 * 配件价格
     *
     * @param b
     * @param product
     * @return
     */
    private List<Float> calculateProductPriceByRangeFromTPPP(float b, float c, float d, DefProduct product) throws Exception {
        List<Float> rangePrice = new ArrayList<>();
        List<DefProductPrice> productPrices = product.getProductPrices();
        if (productPrices == null || productPrices.size() == 0) {
            throw new Exception("您选择产品暂未上线，请选择其他产品！");
        }

        List<DefProductPart> parts = product.getProductPartList();
        //配件价格
        Float partPrice = 0f;
        for (DefProductPart part : parts) {
            partPrice += ((c + d) * part.getCount() * part.getUnitPrice());
        }

        //先判断是否符合范围，符合范围，则先根据单价计算，如果单价是空，则根据单价范围计算
        for (DefProductPrice productPrice : productPrices) {
            if (productPrice.getAreaRangeMin() < b && b < productPrice.getAreaRangeMax()) {
                if (productPrice.getUnitPrice() != null && productPrice.getUnitPrice() > 0) {
                    rangePrice.add(productPrice.getBasicPrice() + partPrice);
                } else {
                    rangePrice.add(productPrice.getBasicPrice() + partPrice);
                    rangePrice.add(productPrice.getBasicPrice() + partPrice);
                }
                return rangePrice;
            }

        }
        return rangePrice;
    }

    /**
     * 计算价格
     * 计算公式 ： 根据面积大小确定计算范围值
     * 基础价格 + 面积*单价
     *
     * @param b
     * @param product
     * @return
     * @throws Exception
     */
    private List<Float> calculateProductPriceByRangeFromBP(float b, DefProduct product) throws Exception {
        List<Float> rangePrice = new ArrayList<>();
        List<DefProductPrice> productPrices = product.getProductPrices();
        if (productPrices == null || productPrices.size() == 0) {
            throw new Exception("您选择产品暂未上线，请选择其他产品！");
        }

        //先判断是否符合范围，符合范围，则先根据单价计算，如果单价是空，则根据单价范围计算
        for (DefProductPrice productPrice : productPrices) {
            if (productPrice.getAreaRangeMin() < b && b < productPrice.getAreaRangeMax()) {
                if (productPrice.getUnitPrice() != null && productPrice.getUnitPrice() > 0) {
                    rangePrice.add(productPrice.getBasicPrice() + productPrice.getUnitPrice() * b);
                } else {
                    rangePrice.add(productPrice.getBasicPrice() + productPrice.getUnitPriceMin() * b);
                    rangePrice.add(productPrice.getBasicPrice() + productPrice.getUnitPriceMax() * b);
                }
                return rangePrice;
            }

        }
        return rangePrice;
    }

    /**
     * 根据B的值计算价格区间 （定义总价）
     * 根据面积直接返回价格
     *
     * @param b
     * @param product
     * @return
     */
    private List<Float> calculateProductPriceByRangeFromTP(float b, DefProduct product) throws Exception {
        List<Float> rangePrice = new ArrayList<>();
        List<DefProductPrice> productPrices = product.getProductPrices();
        if (productPrices == null || productPrices.size() == 0) {
            throw new Exception("您选择产品暂未上线，请选择其他产品！");
        }

        //先判断是否符合范围，符合范围，则先根据单价计算，如果单价是空，则根据单价范围计算
        for (DefProductPrice productPrice : productPrices) {
            if (productPrice.getAreaRangeMin() < b && b < productPrice.getAreaRangeMax()) {
                if (productPrice.getUnitPrice() != null && productPrice.getUnitPrice() > 0) {
                    rangePrice.add(productPrice.getUnitPrice());
                } else {
                    rangePrice.add(productPrice.getUnitPriceMin());
                    rangePrice.add(productPrice.getUnitPriceMax());
                }
                return rangePrice;
            }

        }
        return rangePrice;
    }

    /**
     * 根据B的值计算价格区间 （定义是单价）
     * 根据面积* 单价
     *
     * @param b
     * @param product
     * @return
     */
    private List<Float> calculateProductPriceByRangeFromUP(float b, DefProduct product) throws Exception {
        List<Float> rangePrice = new ArrayList<>();
        List<DefProductPrice> productPrices = product.getProductPrices();
        if (productPrices == null || productPrices.size() == 0) {
            throw new Exception("您选择产品暂未上线，请选择其他产品！");
        }

        //先判断是否符合范围，符合范围，则先根据单价计算，如果单价是空，则根据单价范围计算
        for (DefProductPrice productPrice : productPrices) {
            if (productPrice.getAreaRangeMin() < b && b < productPrice.getAreaRangeMax()) {
                if (productPrice.getUnitPrice() != null && productPrice.getUnitPrice() > 0) {
                    rangePrice.add(productPrice.getUnitPrice() * b);
                } else {
                    rangePrice.add(productPrice.getUnitPriceMin() * b);
                    rangePrice.add(productPrice.getUnitPriceMax() * b);
                }
                return rangePrice;
            }

        }
        return rangePrice;

    }

    /**
     * 将List转成Map
     *
     * @param productList
     * @return
     */
    private Map<Integer, DefProduct> parseProdcutList2Map(List<DefProduct> productList) {
        Map<Integer, DefProduct> productMap = new HashMap<>();
        if (productList == null || productList.size() == 0) {
            return productMap;
        }

        //列表不为空
        for (DefProduct product : productList) {
            productMap.put(product.getId(), product);
        }
        return productMap;
    }


}




