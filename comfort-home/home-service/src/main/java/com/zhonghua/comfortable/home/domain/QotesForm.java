package com.zhonghua.comfortable.home.domain;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:44
 **/
public class QotesForm {
    private String phoneNum;
    private Integer type;
    private float usableArea; // 使用面积
    private Integer parlorCount;//客厅数量
    private Integer roomCount;//房间数量
    private Integer liveCount; //居住人数
    private List<Integer> productList;//产品列表

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public Integer getParlorCount() {
        return parlorCount;
    }

    public void setParlorCount(Integer parlorCount) {
        this.parlorCount = parlorCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(Integer liveCount) {
        this.liveCount = liveCount;
    }

    public List<Integer> getProductList() {
        return productList;
    }

    public void setProductList(List<Integer> productList) {
        this.productList = productList;
    }
}
