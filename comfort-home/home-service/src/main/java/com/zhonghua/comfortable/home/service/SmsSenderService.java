package com.zhonghua.comfortable.home.service;

import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.zhonghua.comfortable.home.domain.SmsContent;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 23:22
 **/
public interface SmsSenderService {

    /**
     * 发送短信内容
     *
     * @param content
     * @throws Exception
     */
    SendSmsResponse sendSms(SmsContent content);

    /**
     * 查询发送明细
     * @param bizId
     * @return
     * @throws ClientException
     */
    QuerySendDetailsResponse querySendDetails(String bizId) throws ClientException;
}
