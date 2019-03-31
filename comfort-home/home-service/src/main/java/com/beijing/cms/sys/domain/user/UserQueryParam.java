package com.beijing.cms.sys.domain.user;


import com.beijing.cms.sys.domain.common.ListQueryPojo;

/**
 * Created by mazeguo on 2017/5/30.
 */
public class UserQueryParam extends ListQueryPojo {
    private String userName;//用户登录名
    private String realName; //真实名字
    private String key;
    private Integer roleId;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
