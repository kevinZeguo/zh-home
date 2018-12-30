package com.zhonghua.comfortable.home.service.impl;

import com.zhonghua.comfortable.home.domain.SmsContent;
import com.zhonghua.comfortable.home.service.SmsSenderService;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 23:23
 **/
public class SmsSenderServiceImpl implements SmsSenderService {
    private static Logger logger = Logger.getLogger(SmsSenderServiceImpl.class);

    @Value("${zh.sms.send.user}")
    private String user;
    @Value("${zh.sms.send.password}")
    private String password;
    @Value("${zh.sms.send.address}")
    private String smsAddress;

    @Override
    public void sendSms(SmsContent content) throws Exception {
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod(smsAddress);
        // PostMethod post = new PostMethod("http://sms.webchinese.cn/web_api/");
        post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");// 在头文件中设置转码
        NameValuePair[] data = {new NameValuePair("Uid", user),// 注册的用户名
                new NameValuePair("Key", password),// 注册成功后,登录网站后得到的密钥
                new NameValuePair("smsMob", content.getPhoneNum()),// 手机号码
                new NameValuePair("smsText", content.getContent())};// 短信内容
        post.setRequestBody(data);

        client.executeMethod(post);
        Header[] headers = post.getResponseHeaders();
        int statusCode = post.getStatusCode();
        logger.warn("向用户:[" + content.getPhoneNum() + "]发送短信 -- > statusCode:" + statusCode);
        for (Header h : headers) {
            logger.warn("向用户:[" + content.getPhoneNum() + "]发送短信 -- > 消息头:[" + h.toString() + "]");
        }
        String result = new String(post.getResponseBodyAsString().getBytes("gbk"));
        logger.warn("向用户:[" + content.getPhoneNum() + "]发送短信:[" + content.getContent() + "],发送返回信息:[" + result + "]");
    }
}
