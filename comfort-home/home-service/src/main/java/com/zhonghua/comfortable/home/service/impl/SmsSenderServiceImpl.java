package com.zhonghua.comfortable.home.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.zhonghua.comfortable.home.domain.SmsContent;
import com.zhonghua.comfortable.home.service.SmsSenderService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 23:23
 **/
@Service
public class SmsSenderServiceImpl implements SmsSenderService {
    private static Logger logger = LoggerFactory.getLogger(SmsSenderServiceImpl.class);
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
//    @Value("${ali.yun.sms.accessKeyId}")
    private static final String accessKeyId = "LTAIraBaesiGmRzt";
    //    @Value("${ali.yun.sms.accessKeySecret}")
    private static final String accessKeySecret = "Dk424UF4f1sCleHrxFnl4pQnJFOTc5";
    @Value("${ali.yun.sms.templateCode}")
    private String templateCode = "SMS_153993418";


    @Value("${ali.yun.sms.templateCodes}")
    private String templateCodes;

    @Value("${ali.yun.sms.register.templateCode}")
    private String registerTemplateCode = "SMS_153993418";

    private List<String> templateCodeList = null;
    //    @Value("${ali.yun.sms.signName}")
    private static final String signName = "众华舒适家";
    //    @Value("${ali.yun.sms.outId}")
    private static final String outId = "signName";

    @Value("${ali.yun.sms.send.isopen}")
    private boolean open = true;


    @Override
    public SendSmsResponse sendSms(SmsContent content) {
        String templateCode = getTemplateCode(content.getContent());
        return this.sendSms(content, templateCode);
    }

    private SendSmsResponse sendSms(SmsContent content, String templateCode) {
        SendSmsResponse sendSmsResponse = null;
        try {
            //可自助调整超时时间
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");

            //初始化acsClient,暂不支持region化
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);

            //组装请求对象-具体描述见控制台-文档部分内容
            SendSmsRequest request = new SendSmsRequest();
            //必填:待发送手机号
            request.setPhoneNumbers(content.getPhoneNum());
            //必填:短信签名-可在短信控制台中找到
            request.setSignName(signName);
            //必填:短信模板-可在短信控制台中找到
            request.setTemplateCode(templateCode);

            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            request.setTemplateParam(content.getContent());

            //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
            //request.setSmsUpExtendCode("90997");
            //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
            request.setOutId(outId);
            logger.warn("向用户[" + content.getPhoneNum() + "],开始发送短信内容:" + content.getContent() + "，使用模板：[" + templateCode + "]");
            if (open) {
                //hint 此处可能会抛出异常，注意catch
                sendSmsResponse = acsClient.getAcsResponse(request);
                logger.warn("向用户[" + content.getPhoneNum() + "]发送短信,处理结果:" + sendSmsResponse.getMessage());
            } else {
                sendSmsResponse = new SendSmsResponse();
                sendSmsResponse.setCode("closed");
                sendSmsResponse.setMessage("短信服务关闭，暂不发送短信");
            }

        } catch (Exception e) {
            sendSmsResponse = new SendSmsResponse();
            sendSmsResponse.setMessage(e.getMessage());
            sendSmsResponse.setCode("ERROR");
            logger.error("短信发送失败，请求参数：[" + JSONObject.toJSONString(content) + "]", e);
        }
        return sendSmsResponse;
    }

    /**
     * 获取模板代码
     *
     * @param content
     * @return
     */
    private String getTemplateCode(String content) {
        initTemplateCodeList();
        if (StringUtils.isBlank(content)) {
            return templateCode;
        }
        JSONObject contentObj = JSONObject.parseObject(content);
        return templateCodeList.get(contentObj.size() / 2 - 1);
    }

    private void initTemplateCodeList() {
        if (templateCodeList == null || templateCodeList.size() == 0) {
            templateCodeList = new ArrayList<>();
            for (String code : templateCodes.split(",")) {
                templateCodeList.add(code);
            }
        }


    }


    public QuerySendDetailsResponse querySendDetails(String bizId) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        QuerySendDetailsRequest request = new QuerySendDetailsRequest();
        //必填-号码
        request.setPhoneNumber("15000000000");
        //可选-流水号
        request.setBizId(bizId);
        //必填-发送日期 支持30天内记录查询，格式yyyyMMdd
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        request.setSendDate(ft.format(new Date()));
        //必填-页大小
        request.setPageSize(10L);
        //必填-当前页码从1开始计数
        request.setCurrentPage(1L);

        //hint 此处可能会抛出异常，注意catch
        QuerySendDetailsResponse querySendDetailsResponse = acsClient.getAcsResponse(request);
        return querySendDetailsResponse;
    }

    @Override
    public SendSmsResponse sendRegisterSms(SmsContent content) throws Exception {
        return this.sendSms(content, registerTemplateCode);
    }


    /**
     * 测试短信发送
     *
     * @param args
     */
    public static void main(String[] args) {
        SmsSenderServiceImpl smsSenderService = new SmsSenderServiceImpl();
        SmsContent smsContent = new SmsContent();
        smsContent.setPhoneNum("18910328375");
        smsContent.setContent("");
        try {
            SendSmsResponse response = smsSenderService.sendSms(smsContent);
            System.out.println("response 0 :" + JSONObject.toJSONString(response));
            String bizId = response.getBizId();
            QuerySendDetailsResponse response1 = smsSenderService.querySendDetails(bizId);
            System.out.println("response1 :  " + JSONObject.toJSONString(response1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
