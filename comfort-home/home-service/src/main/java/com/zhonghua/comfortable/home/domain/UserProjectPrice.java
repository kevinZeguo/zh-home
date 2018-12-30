package com.zhonghua.comfortable.home.domain;

import java.util.Date;
import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-29 23:21
 **/
public class UserProjectPrice {
    private UserHouse userHouse;
    private List<UserChooseProduct> chooseProductList ;//选择产品列表
    private String phoneNum; //用户的手机号
    private float totalCostMin;//总报价最小值
    private float totalCostMax;//总报价最大值
    private Date offerDate;//报价时间
    private Date applicationTime;//申请时间

    public UserHouse getUserHouse() {
        return userHouse;
    }

    public void setUserHouse(UserHouse userHouse) {
        this.userHouse = userHouse;
    }

    public List<UserChooseProduct> getChooseProductList() {
        return chooseProductList;
    }

    public void setChooseProductList(List<UserChooseProduct> chooseProductList) {
        this.chooseProductList = chooseProductList;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public float getTotalCostMin() {
        return totalCostMin;
    }

    public void setTotalCostMin(float totalCostMin) {
        this.totalCostMin = totalCostMin;
    }

    public float getTotalCostMax() {
        return totalCostMax;
    }

    public void setTotalCostMax(float totalCostMax) {
        this.totalCostMax = totalCostMax;
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }
}
