package com.zhonghua.comfortable.home.website.web.controller;

import java.net.URLDecoder;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSONObject;

import com.zhonghua.comfortable.home.domain.DefProduct;
import com.zhonghua.comfortable.home.domain.QotesForm;
import com.zhonghua.comfortable.home.domain.UserHouse;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;
import com.zhonghua.comfortable.home.service.ProductService;
import com.zhonghua.comfortable.home.service.QuoteCalculatorService;
import com.zhonghua.comfortable.home.service.QuoteSendService;

/**
 * @author mazeguo
 * @date 2018-12-24 22:50
 * 首页控制类
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/")
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private ProductService productService;
    @Autowired
    private QuoteCalculatorService quoteCalculatorService;
    @Autowired
    private QuoteSendService quoteSendService;

    private List<Integer> parseStr2List(String ps) {
        List<Integer> productIds = new ArrayList<>();

        for (String p : ps.split(",")) {
            productIds.add(Integer.parseInt(p));
        }

        return productIds;
    }

    /**
     * 获取模块及模块下列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "product.ajax", method = RequestMethod.GET)
    public JSONObject getModuleList(HttpServletRequest request, HttpServletResponse response) {
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
    @ResponseBody
    @RequestMapping(value = "quote.ajax", method = RequestMethod.GET)
    public JSONObject getQuotes(String d) {
        JSONObject result = new JSONObject();
        try {
            d = URLDecoder.decode(d, "utf-8");
            QotesForm form = JSONObject.parseObject(d, QotesForm.class);

            // 将产品字符串转换成ID
            List<Integer> productIds = parseStr2List(form.getPs());

            // 校验参数
            // 转换参数
            UserHouse userHouse = new UserHouse();

            // copy相同属性
            BeanUtils.copyProperties(form, userHouse);

            // 计算报价
            UserProjectPrice projectPrice = quoteCalculatorService.calculatePrice(userHouse, productIds);

            // 发送报价
            quoteSendService.sendQuoteToUser(projectPrice, userHouse);
            result.put("success", true);
            result.put("message", "请求成功！");
        } catch (Exception e) {
            logger.error("获取报价失败，请求信息【" + d + "】！", e);
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
    @ResponseBody
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public JSONObject register(String userName, String phoneNum) {
        JSONObject result = new JSONObject();
        try {
            if (StringUtils.isBlank(userName)) {
                result.put("success", false);
                result.put("message", "请填写用户姓名！");
            }

            if (StringUtils.isBlank(phoneNum)) {
                result.put("success", false);
                result.put("message", "请填写正确的手机号！");
            }

            userName = URLDecoder.decode(userName, "utf-8");

            // 发送报价
            quoteSendService.sendRegister2User(userName, phoneNum);
            result.put("success", true);
            result.put("message", "请求成功！");
        } catch (Exception e) {
            logger.error("发送通知失败，请求信息【" + phoneNum + "】！", e);
            result.put("success", false);
            result.put("message", e.getMessage());
        }

        return result;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
