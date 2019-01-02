package com.zhonghua.comfortable.home.domain;

import java.util.Date;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 23:22
 **/
public class SmsContent {
    private Integer id;
    private Integer userId;//用户Id
    private String phoneNum;//手机号
    private String content;//消息内容
    private String sendResult;//发送消息状态
    private String sendMessage; //发送返回消息内容
    private Date sendTme;//发送时间
    private Date created;//创建时间
    private String bizId;//业务Id
    private String requestId;//申请单id

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSendResult() {
        return sendResult;
    }

    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }

    public String getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

    public Date getSendTme() {
        return sendTme;
    }

    public void setSendTme(Date sendTme) {
        this.sendTme = sendTme;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

