package com.zhonghua.comfortable.home.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.zhonghua.comfortable.home.dao.ZhSmsSendDao;
import com.zhonghua.comfortable.home.dao.ZhUserChooseProductDao;
import com.zhonghua.comfortable.home.dao.ZhUserInfoDao;
import com.zhonghua.comfortable.home.domain.SmsContent;
import com.zhonghua.comfortable.home.domain.UserChooseProduct;
import com.zhonghua.comfortable.home.domain.UserHouse;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;
import com.zhonghua.comfortable.home.service.QuoteSendService;
import com.zhonghua.comfortable.home.service.SmsSenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:53
 **/
@Service
public class QuoteSendServiceImpl implements QuoteSendService {
    private static final Logger logger = LoggerFactory.getLogger(QuoteSendServiceImpl.class);
    @Autowired
    private SmsSenderService smsSenderService;
    @Autowired
    private ZhUserChooseProductDao zhUserChooseProductDao;
    @Autowired
    private ZhUserInfoDao zhUserInfoDao;
    @Autowired
    private ZhSmsSendDao zhSmsSendDao;

    @Override
    @Transactional
    public void sendQuoteToUser(UserProjectPrice projectPrice, UserHouse userhouse) throws Exception {
        //保存用户信息
        zhUserInfoDao.insert(userhouse);

        //保存选购产品信息
        if (projectPrice != null && projectPrice.getChooseProductList() != null && projectPrice.getChooseProductList().size() > 0) {
            List<UserChooseProduct> products = projectPrice.getChooseProductList();
            for (UserChooseProduct product : products) {
                product.setUserId(userhouse.getId());
                zhUserChooseProductDao.insert(product);
            }
        }

        //保存短信内容
        SmsContent content = new SmsContent();
        content.setUserId(userhouse.getId());
        content.setSendTme(new Date());
        content.setSendResult("send");
        content.setPhoneNum(userhouse.getPhoneNum());
        //组装发送短信内容
        String info = getDefaultQuoteSmsContent(projectPrice);
        content.setContent(info);
        zhSmsSendDao.insert(content);
        //发送短信
        SendSmsResponse response = smsSenderService.sendSms(content);
        if (response != null) {
            //记录发送结果
            content.setSendResult(response.getCode());
            content.setSendMessage(response.getMessage());
            content.setBizId(response.getBizId());
            content.setRequestId(response.getRequestId());
        } else {
            content.setSendResult("error");
            content.setSendMessage("未知原因");
        }
        zhSmsSendDao.updateStatusById(content);
    }

    /**
     * 拼装短信内容
     *
     * @param projectPrice
     * @return
     */
    private String getDefaultQuoteSmsContent(UserProjectPrice projectPrice) {
        JSONObject content = new JSONObject();
        //短信模板
        NumberFormat nf = NumberFormat.getInstance();

        List<UserChooseProduct> products = projectPrice.getChooseProductList();
        for (UserChooseProduct product : products) {
            String price = null;

            if (product.getCostMax() == product.getCostMin()) {
                price = nf.format(product.getCostMin()) + "元";
            } else {
                price = nf.format(product.getCostMin()) + "-" + nf.format(product.getCostMax()) + "元";
            }
            content.put("price" + product.getModuleId(), price);
        }
        return content.toJSONString();
    }
}
