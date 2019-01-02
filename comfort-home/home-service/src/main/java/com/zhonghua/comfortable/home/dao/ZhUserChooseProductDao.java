package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.UserChooseProduct;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-31 23:59
 **/
public interface ZhUserChooseProductDao {
    /**
     * 用户选择产品
     *
     * @param product
     * @throws Exception
     */
    void insert(UserChooseProduct product) throws Exception;
}
