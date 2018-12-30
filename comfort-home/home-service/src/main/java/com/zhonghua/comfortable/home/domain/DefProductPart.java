package com.zhonghua.comfortable.home.domain;

import java.util.Date;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 10:58
 * 产品配件
 **/
public class DefProductPart {
    private Integer id;
    private String name;//配件名称
    private float unitPrice;//单价
    private Integer count;//数量
    private Integer areaRangeMin;//适用面积范围最小值
    private Integer areaRangeMax;//适用面积范围最大值
    private Integer creator;
    private Integer modifier;
    private Date created;
    private Date modified;
    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAreaRangeMin() {
        return areaRangeMin;
    }

    public void setAreaRangeMin(Integer areaRangeMin) {
        this.areaRangeMin = areaRangeMin;
    }

    public Integer getAreaRangeMax() {
        return areaRangeMax;
    }

    public void setAreaRangeMax(Integer areaRangeMax) {
        this.areaRangeMax = areaRangeMax;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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
