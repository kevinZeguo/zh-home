package com.zhonghua.comfortable.home.website.web.controller;

import com.zhonghua.comfortable.home.domain.DefProduct;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;
import com.zhonghua.comfortable.home.service.QuoteCalculatorService;
import org.apache.log4j.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

import com.zhonghua.comfortable.home.domain.QotesForm;
import com.zhonghua.comfortable.home.domain.UserHouse;
import com.zhonghua.comfortable.home.service.ProductService;
import com.zhonghua.comfortable.home.service.QuoteSendService;

import java.util.List;

/**
 * @author mazeguo
 * @date 2018-12-24 22:50
 * 首页控制类
 */
@Controller
@RequestMapping("/")
public class MainController {
    private static final Logger logger = Logger.getLogger(MainController.class);
    @Autowired
    private ProductService productService;
    @Autowired
    private QuoteCalculatorService quoteCalculatorService;
    @Autowired
    private QuoteSendService quoteSendService;

    /**
     * 获取模块及模块下列表
     *
     * @return
     */
    @RequestMapping("moduleList")
    public JSONObject getModuleList() {
        JSONObject result = new JSONObject();
        try {
            List<DefProduct> products = productService.getAllProductList();
            result.put("list", products);
            result.put("success", true);
        } catch (Exception e) {
            logger.error("读取各个模块的产品列表！", e);
            result.put("success", false);
            result.put("message", e.getMessage());
        }

        return result;
    }

    /**
     * 获取报价
     *
     * @return
     */
    @RequestMapping("quotes")
    public JSONObject getQuotes(String data) {
        JSONObject result = new JSONObject();

        try {
            QotesForm form = JSONObject.parseObject(data, QotesForm.class);

            // 校验参数
            // 转换参数
            UserHouse userHouse = new UserHouse();
            // copy相同属性
            BeanUtils.copyProperties(form, userHouse);

            //计算报价
            UserProjectPrice projectPrice = quoteCalculatorService.calculatePrice(userHouse, form.getProductList());
            //发送报价
            quoteSendService.sendQuoteToUser(projectPrice, form.getPhoneNum());
            result.put("success", true);
        } catch (Exception e) {
            logger.error("获取报价失败，请求信息【" + data + "】！", e);
            result.put("success", false);
            result.put("message", e.getMessage());

        }

        return result;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
