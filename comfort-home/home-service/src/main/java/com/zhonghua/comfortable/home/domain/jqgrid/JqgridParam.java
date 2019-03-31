package com.zhonghua.comfortable.home.domain.jqgrid;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-03-17 17:32
 **/
public class JqgridParam {
    private Integer start;
    private Integer limit;
    private Integer page;
    private String orderCol;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getOrderCol() {
        return orderCol;
    }

    public void setOrderCol(String orderCol) {
        this.orderCol = orderCol;
    }
}
