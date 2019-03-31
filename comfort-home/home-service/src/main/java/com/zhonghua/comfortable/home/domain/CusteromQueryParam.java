package com.zhonghua.comfortable.home.domain;

import com.zhonghua.comfortable.home.domain.jqgrid.JqgridParam;

import java.util.Date;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-03-17 17:30
 **/
public class CusteromQueryParam extends JqgridParam {
    private String keys;
    private Date createdStart;
    private Date createdEnd;
    private Integer type;
    private String orderCol;

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public Date getCreatedStart() {
        return createdStart;
    }

    public void setCreatedStart(Date createdStart) {
        this.createdStart = createdStart;
    }

    public Date getCreatedEnd() {
        return createdEnd;
    }

    public void setCreatedEnd(Date createdEnd) {
        this.createdEnd = createdEnd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderCol() {
        return orderCol;
    }

    public void setOrderCol(String orderCol) {
        this.orderCol = orderCol;
    }
}
