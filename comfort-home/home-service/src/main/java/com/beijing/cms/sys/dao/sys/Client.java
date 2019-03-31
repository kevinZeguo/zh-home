package com.beijing.cms.sys.dao.sys;


import com.beijing.cms.sys.domain.user.CmsUser;
import com.beijing.cms.sys.domain.user.SysFunction;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 在线用户对象
 *
 * @author mazeguo
 * @version 1.0
 * @date 2017-5-28
 */
public class Client implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private CmsUser user;

    private Map<Integer, SysFunction> functions;
    private Map<Integer, List<SysFunction>> functionMap;
    /**
     * 用户IP
     */
    private String ip;
    /**
     * 登录时间
     */
    private Date loginTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public CmsUser getUser() {
        return user;
    }

    public void setUser(CmsUser user) {
        this.user = user;
    }

    public Map<Integer, SysFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(Map<Integer, SysFunction> functions) {
        this.functions = functions;
    }

    public Map<Integer, List<SysFunction>> getFunctionMap() {
        return functionMap;
    }

    public void setFunctionMap(Map<Integer, List<SysFunction>> functionMap) {
        this.functionMap = functionMap;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
