package com.beijing.cms.sys.domain.user;

import java.util.Date;

public class SysUserDataRight {
    private Integer id;// int(11) NOT NULL AUTO_INCREMENT COMMENT '用户数据权限Id',
    private Integer userId;// int(11) NOT NULL COMMENT '用户ID',
    private Integer dataType;// int(11) NOT NULL DEFAULT '3' COMMENT '权限类型 1-全部数据权限 2-部分用户数据权限 3-仅能看自己的数据',
    private String dataUserIds;// varchar(256) NOT NULL COMMENT '有权限查看的用户Id',
    private Integer creator;// int(11) DEFAULT NULL COMMENT '创建人',
    private Date created;//datetime DEFAULT NULL COMMENT '创建时间',
    private Integer modifier;// int(11) DEFAULT NULL COMMENT '修改人',
    private Date modified;// datetime DEFAULT NULL COMMENT '修改时间',
    private Integer deleted;// int(2) DEFAULT NULL COMMENT '删除标示',

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

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getDataUserIds() {
        return dataUserIds;
    }

    public void setDataUserIds(String dataUserIds) {
        this.dataUserIds = dataUserIds;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
