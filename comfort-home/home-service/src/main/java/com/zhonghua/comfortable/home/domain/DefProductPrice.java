package com.zhonghua.comfortable.home.domain;

import java.util.Date;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-29 23:28
 **/
public class DefProductPrice {
    private Integer id;
    private Float basicPrice;//基础价格
    private Float unitPrice;//单价
    private Float unitPriceMin;//最小单价
    private Float unitPriceMax;//最大单价
    private Float areaRangeMin;//适用面积范围最小值
    private Float areaRangeMax;//适用面积范围最大值
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

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getUnitPriceMin() {
        return unitPriceMin;
    }

    public void setUnitPriceMin(Float unitPriceMin) {
        this.unitPriceMin = unitPriceMin;
    }

    public Float getUnitPriceMax() {
        return unitPriceMax;
    }

    public void setUnitPriceMax(Float unitPriceMax) {
        this.unitPriceMax = unitPriceMax;
    }

    public Float getAreaRangeMin() {
        return areaRangeMin;
    }

    public void setAreaRangeMin(Float areaRangeMin) {
        this.areaRangeMin = areaRangeMin;
    }

    public Float getAreaRangeMax() {
        return areaRangeMax;
    }

    public void setAreaRangeMax(Float areaRangeMax) {
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

    public Float getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(Float basicPrice) {
        this.basicPrice = basicPrice;
    }
}
