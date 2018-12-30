package com.zhonghua.comfortable.home.domain;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 11:18
 **/
public class UserChooseProduct {
    private Integer id;
    private Integer moduleId; // 模块ID
    private String moduleName;//选择模块名称
    private List<Integer> productIdList;// 当前模块下产品列表
    private float costMin;//价格最小值
    private float costMax;//价格最大值

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Integer> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<Integer> productIdList) {
        this.productIdList = productIdList;
    }

    public float getCostMin() {
        return costMin;
    }

    public void setCostMin(float costMin) {
        this.costMin = costMin;
    }

    public float getCostMax() {
        return costMax;
    }

    public void setCostMax(float costMax) {
        this.costMax = costMax;
    }
}
