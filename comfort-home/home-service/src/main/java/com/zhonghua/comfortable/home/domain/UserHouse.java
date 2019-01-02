package com.zhonghua.comfortable.home.domain;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-29 23:15
 **/
public class UserHouse {
    private Integer id;
    private String phoneNum;//用户手机号
    private String userName;//用户姓名
    private Integer type; //类型 1- 别墅 2-平层 3-复式
    private float floorage;//建筑面积
    private float usableArea; // 使用面积
    private Integer parlorCount;//客厅数量
    private Integer roomCount;//房间数量
    private Integer liveCount; //居住人数


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public float getFloorage() {
        return floorage;
    }

    public void setFloorage(float floorage) {
        this.floorage = floorage;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
