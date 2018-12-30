package com.zhonghua.comfortable.home.service.impl;

import com.zhonghua.comfortable.home.domain.SmsContent;
import com.zhonghua.comfortable.home.domain.UserChooseProduct;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;
import com.zhonghua.comfortable.home.service.QuoteSendService;
import com.zhonghua.comfortable.home.service.SmsSenderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:53
 **/
@Service
public class QuoteSendServiceImpl implements QuoteSendService {
    private static final Logger logger = Logger.getLogger(QuoteSendServiceImpl.class);
    @Autowired
    private SmsSenderService smsSenderService;

    @Override
    public void sendQuoteToUser(UserProjectPrice projectPrice, String phoneNum) throws Exception {
        SmsContent content = new SmsContent();
        content.setPhoneNum(phoneNum);
        //组装发送短信内容
        String info = getDefaultQuoteSmsContent(projectPrice);
        content.setContent(info);
        //发送短信
        smsSenderService.sendSms(content);
        //记录发送结果
    }

    /**
     * 拼装短信内容
     *
     * @param projectPrice
     * @return
     */
    private String getDefaultQuoteSmsContent(UserProjectPrice projectPrice) {
        //短信模板
        String defaultTemplate = "[众华舒适家]亲爱的⽤用户，您的预估报价已新鲜出炉，%s 众华舒适家专业设计会在24⼩小时内给您回电，向您阐述不不同价格区间的差 异，祝您⽣生活愉快!";
        StringBuffer quoteInfo = new StringBuffer();
        List<UserChooseProduct> products = projectPrice.getChooseProductList();
        for (UserChooseProduct product : products) {
            quoteInfo.append("获得");
            quoteInfo.append(product.getModuleName());
            quoteInfo.append("需");
            if (product.getCostMax() == product.getCostMin()) {
                quoteInfo.append(product.getCostMin() + "元");
            } else {
                quoteInfo.append(product.getCostMin() + "-" + product.getCostMax() + "元");
            }
            quoteInfo.append(";");
        }
        String content = String.format(defaultTemplate, quoteInfo.toString());
        return content;
    }
}
