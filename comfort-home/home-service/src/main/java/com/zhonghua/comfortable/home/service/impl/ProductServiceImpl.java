package com.zhonghua.comfortable.home.service.impl;

import com.zhonghua.comfortable.home.dao.ZhProductDao;
import com.zhonghua.comfortable.home.dao.ZhProductPartDao;
import com.zhonghua.comfortable.home.dao.ZhProductPriceDao;
import com.zhonghua.comfortable.home.domain.DefProduct;
import com.zhonghua.comfortable.home.domain.DefProductPart;
import com.zhonghua.comfortable.home.domain.DefProductPrice;
import com.zhonghua.comfortable.home.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:38
 **/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ZhProductDao zhProductDao;
    @Autowired
    private ZhProductPartDao zhProductPartDao;
    @Autowired
    private ZhProductPriceDao zhProductPriceDao;

    @Override
    public List<DefProduct> getAllProductList() throws Exception {
        List<DefProduct> productList = zhProductDao.selectProductBaseInfoList();
        if (productList != null && productList.size() > 0) {
            return productList;
        }
        productList = new ArrayList<>();
        DefProduct product = new DefProduct();
        product.setId(10001);
        product.setBrand("大金空调");
        product.setModule(1);
        product.setModuleName("凉爽的夏⽇");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(10002);
        product.setBrand("⽇立空调");
        product.setModule(1);
        product.setModuleName("凉爽的夏⽇");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(10003);
        product.setBrand("约克空调");
        product.setModule(1);
        product.setModuleName("凉爽的夏⽇");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(10004);
        product.setBrand("格力空调");
        product.setModule(1);
        product.setModuleName("凉爽的夏⽇");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(20001);
        product.setBrand("霍尼韦尔");
        product.setModule(2);
        product.setModuleName("清新的空气");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(20002);
        product.setBrand("森德新⻛");
        product.setModule(2);
        product.setModuleName("清新的空气");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(20003);
        product.setBrand("希海姆新⻛");
        product.setModule(2);
        product.setModuleName("清新的空气");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(20004);
        product.setBrand("第五季新⻛");
        product.setModule(2);
        product.setModuleName("清新的空气");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(30001);
        product.setBrand("霍尼⻙尔");
        product.setModule(3);
        product.setModuleName("洁净的⽔源");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(30002);
        product.setBrand("怡⼝净水");
        product.setModule(3);
        product.setModuleName("洁净的⽔源");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(40001);
        product.setBrand("威能采暖炉+瑞好地暖");
        product.setModule(4);
        product.setModuleName("温暖的房间");
        product.setFormula("BP");
        productList.add(product);

        product = new DefProduct();
        product.setId(40002);
        product.setBrand("威能采暖炉+赫兰德暖⽓⽚");
        product.setModule(4);
        product.setModuleName("温暖的房间");
        product.setFormula("TP+PP");
        productList.add(product);

        product = new DefProduct();
        product.setId(40003);
        product.setBrand("卡洛毛细管网");
        product.setModule(4);
        product.setModuleName("温暖的房间");
        product.setFormula("UP");
        productList.add(product);

        product = new DefProduct();
        product.setId(50001);
        product.setBrand("林内燃⽓热⽔器");
        product.setModule(5);
        product.setModuleName("24⼩时热⽔");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(50002);
        product.setBrand("能率燃⽓热⽔器");
        product.setModule(5);
        product.setModuleName("24⼩时热⽔");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(50003);
        product.setBrand("威能太阳能热⽔器");
        product.setModule(5);
        product.setModuleName("24⼩时热⽔");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(60001);
        product.setBrand("集成线控+APP联动控制");
        product.setModule(6);
        product.setModuleName("智能的房⼦");
        product.setFormula("TP");
        productList.add(product);

        product = new DefProduct();
        product.setId(60002);
        product.setBrand("灯光窗帘音乐模块");
        product.setModule(6);
        product.setModuleName("智能的房⼦");
        product.setFormula("BP");
        productList.add(product);
        //todo 将改为通过数据库读取
        return productList;
    }

    @Override
    public List<DefProduct> getAllProductListWithPrice() throws Exception {
        List<DefProduct> productList = zhProductDao.selectAllProductList();

        //静态数据
        if (productList == null || productList.size() ==0) {
            productList = getAllProductList();
        }

        for (DefProduct defProduct : productList) {
            //todo 改为通过数据库读取
            defProduct.setProductPrices(getDefProductPriceList(defProduct.getId()));
            defProduct.setProductPartList(getDefPartsList(defProduct.getId()));
        }

        return productList;
    }

    /**
     * 获取产品列表
     *
     * @param id
     * @return
     */
    private List<DefProductPart> getDefPartsList(Integer id) throws Exception {
        List<DefProductPart> parts = zhProductPartDao.selectListByProductId(id);
        if (parts != null && parts.size() > 0) {
            return parts;
        }
        parts = new ArrayList<>();

        if (id.equals(10001) || id.equals(10002) || id.equals(10003) || id.equals(10004) || id.equals(10005)) {
            DefProductPart part = new DefProductPart();
            part.setCount(1);
            part.setUnitPrice(500);
            part.setName("出风⼝扇页");
            parts.add(part);
        } else if (id.equals(20001) || id.equals(20002) || id.equals(20003) || id.equals(20004) || id.equals(20005)) {
            DefProductPart part = new DefProductPart();
            part.setCount(2);
            part.setUnitPrice(200);
            part.setName("送⻛进风⼝");
            parts.add(part);
        } else if (id.equals(40002)) {
            DefProductPart part = new DefProductPart();
            part.setCount(1);
            part.setUnitPrice(700);
            part.setName("赫兰德暖⽓⽚");
            parts.add(part);


        }
        return parts;
    }

    /**
     * 产品报价列表
     *
     * @param id
     * @return
     */
    private List<DefProductPrice> getDefProductPriceList(Integer id) throws Exception {
        List<DefProductPrice> priceList = zhProductPriceDao.selectListByProductId(id);

        if (priceList != null && priceList.size() > 0) {
            return priceList;
        }
        priceList = new ArrayList<>();

        DefProductPrice price = new DefProductPrice();
        if (id.equals(10001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(360f);
            price.setUnitPriceMax(500f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(350f);
            price.setUnitPriceMax(480f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(340f);
            price.setUnitPriceMax(460f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(310f);
            price.setUnitPriceMax(450f);
            priceList.add(price);
        } else if (id.equals(10002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(320f);
            price.setUnitPriceMax(450f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(320f);
            price.setUnitPriceMax(440f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(310f);
            price.setUnitPriceMax(400f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(300f);
            price.setUnitPriceMax(400f);
            priceList.add(price);
        } else if (id.equals(10003)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(340f);
            price.setUnitPriceMax(450f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(330f);
            price.setUnitPriceMax(440f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(320f);
            price.setUnitPriceMax(400f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(310f);
            price.setUnitPriceMax(400f);
            priceList.add(price);

        } else if (id.equals(10004)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(330f);
            price.setUnitPriceMax(450f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(330f);
            price.setUnitPriceMax(440f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(310f);
            price.setUnitPriceMax(400f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(300f);
            price.setUnitPriceMax(400f);
            priceList.add(price);
        } else if (id.equals(20001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(150f);
            price.setUnitPriceMax(210f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(130f);
            price.setUnitPriceMax(170f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(110f);
            price.setUnitPriceMax(130f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(90f);
            price.setUnitPriceMax(110f);
            priceList.add(price);

        } else if (id.equals(20002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(180f);
            price.setUnitPriceMax(220f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(140f);
            price.setUnitPriceMax(200f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(120f);
            price.setUnitPriceMax(140f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(100f);
            price.setUnitPriceMax(120f);
            priceList.add(price);

        } else if (id.equals(20003)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(130f);
            price.setUnitPriceMax(200f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(120f);
            price.setUnitPriceMax(250f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(100f);
            price.setUnitPriceMax(110f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(90f);
            price.setUnitPriceMax(110f);
            priceList.add(price);
        } else if (id.equals(20004)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(120f);
            price.setUnitPriceMax(200f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(110f);
            price.setUnitPriceMax(150f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(90f);
            price.setUnitPriceMax(110f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(80f);
            price.setUnitPriceMax(110f);
            priceList.add(price);

        } else if (id.equals(30001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(16370f);
            price.setUnitPriceMax(19500f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(200f);
            price.setUnitPriceMin(17580f);
            price.setUnitPriceMax(19600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(200f);
            price.setAreaRangeMax(350f);
            price.setUnitPriceMin(19580f);
            price.setUnitPriceMax(21600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(350f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(21600f);
            price.setUnitPriceMax(50000f);
            priceList.add(price);

        } else if (id.equals(30002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(19780f);
            price.setUnitPriceMax(29980f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(200f);
            price.setUnitPriceMin(23580f);
            price.setUnitPriceMax(35600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(200f);
            price.setAreaRangeMax(350f);
            price.setUnitPriceMin(35600f);
            price.setUnitPriceMax(35600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(350f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(31600f);
            price.setUnitPriceMax(75000f);
            priceList.add(price);

        } else if (id.equals(40001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setBasicPrice(8000f);
            price.setUnitPrice(150f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setBasicPrice(11600f);
            price.setUnitPrice(150f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setBasicPrice(17600f);
            price.setUnitPrice(150f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setBasicPrice(17600f);
            price.setUnitPrice(19000f);
            priceList.add(price);

        } else if (id.equals(40002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setBasicPrice(9000f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setBasicPrice(12600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setBasicPrice(18000f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setBasicPrice(20000f);
            priceList.add(price);


        } else if (id.equals(40003)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(1000f);
            price.setUnitPriceMax(2000f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(1000f);
            price.setUnitPriceMax(1800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(900f);
            price.setUnitPriceMax(1600f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(800f);
            price.setUnitPriceMax(1500f);
            priceList.add(price);

        } else if (id.equals(50001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(4980f);
            price.setUnitPriceMax(8980f);
            priceList.add(price);
            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(7980f);
            price.setUnitPriceMax(14800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(13980f);
            price.setUnitPriceMax(18800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(19000f);
            price.setUnitPriceMax(25000f);
            priceList.add(price);

        } else if (id.equals(50002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(3980f);
            price.setUnitPriceMax(8980f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(6980f);
            price.setUnitPriceMax(14800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(12980f);
            price.setUnitPriceMax(18800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(15000f);
            price.setUnitPriceMax(25000f);
            priceList.add(price);


        } else if (id.equals(50003)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(16000f);
            price.setUnitPriceMax(25000f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(19980f);
            price.setUnitPriceMax(34800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(23980f);
            price.setUnitPriceMax(39800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(33900f);
            price.setUnitPriceMax(48000f);
            priceList.add(price);


        } else if (id.equals(60001)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setUnitPriceMin(4980f);
            price.setUnitPriceMax(8980f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setUnitPriceMin(7980f);
            price.setUnitPriceMax(14800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setUnitPriceMin(13980f);
            price.setUnitPriceMax(18800f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setUnitPriceMin(19000f);
            price.setUnitPriceMax(25000f);
            priceList.add(price);

        } else if (id.equals(60002)) {
            price.setAreaRangeMin(0f);
            price.setAreaRangeMax(90f);
            price.setBasicPrice(4980f);
            price.setUnitPrice(80f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(90f);
            price.setAreaRangeMax(150f);
            price.setBasicPrice(6980f);
            price.setUnitPrice(80f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(150f);
            price.setAreaRangeMax(250f);
            price.setBasicPrice(8980f);
            price.setUnitPrice(80f);
            priceList.add(price);

            price = new DefProductPrice();
            price.setAreaRangeMin(250f);
            price.setAreaRangeMax(100000f);
            price.setBasicPrice(12980f);
            price.setUnitPrice(80f);

            priceList.add(price);
        }

        return priceList;
    }
}
