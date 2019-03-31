package com.beijing.cms.sys.domain.common;

/**
 * Created by mazeguo on 2017/5/30.
 */
public class ListQueryPojo {
    private boolean _search;
    private Long nd;
    private Integer rows = 10;
    private Integer page = 1;
    private Integer start = 0;
    private Integer limit = 10;
    private String userKey;
    private String sidx;
    private String sord; //排序方式 asc desc

    public boolean is_search() {
        return _search;
    }

    public void set_search(boolean _search) {
        this._search = _search;
    }

    public Long getNd() {
        return nd;
    }

    public void setNd(Long nd) {
        this.nd = nd;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        if (rows != null) {
            this.limit = rows;
        }
        if (page != null && rows != null) {
            start = (page - 1) * rows;
        }

        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (page != null && rows != null) {
            start = (page - 1) * rows;
        }
        this.page = page;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

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

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }
}
