package com.zhonghua.comfortable.home.domain;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-29 23:24
 * 家装设施
 **/
public class DefProduct {
    private Integer id;
    private String brand;//品牌
    private String model;//型号
    private Integer module;//归属模块  1-凉爽的夏⽇ 2-清新的空⽓ 3-洁净的⽔源 4-温暖的房间 5-24⼩小时热⽔ 6-智能的房⼦
    private String moduleName; // 模块名称
    private List<DefProductPrice> productPrices; //单价设置定义
    private List<DefProductPart> productPartList;// 配件列表
    private String formula;//计算公式

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public List<DefProductPrice> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(List<DefProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    public List<DefProductPart> getProductPartList() {
        return productPartList;
    }


    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setProductPartList(List<DefProductPart> productPartList) {
        this.productPartList = productPartList;
    }
}
