package com.beijing.cms.sys.domain.user;

import java.util.Date;
import java.util.List;

/**
 * Created by mazeguo on 2017/5/28.
 */
public class CmsUser {
    private Integer userId; //用户ID
    private String userName; //用户登录名
    private String realName;//用户实际名称
    private String password;//密码
    private Date loginTime;//用户登录时间
    private Integer status;//用户状态
    private String userKey;//用户key
    private String departName;
    private List<SysDepart> sysDepartList;//用户归属部门
    private Boolean login;
    private String k;
    private String v;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public List<SysDepart> getSysDepartList() {
        return sysDepartList;
    }

    public void setSysDepartList(List<SysDepart> sysDepartList) {
        this.sysDepartList = sysDepartList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }
}


