package com.zhonghua.comfortable.home.service;

import com.zhonghua.comfortable.home.domain.DefProduct;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:35
 **/
public interface ProductService {
    /**
     * 获取所有产品列表
     *
     * @return
     * @throws Exception
     */
    List<DefProduct> getAllProductList() throws Exception;

    /**
     * 获取产品列表包含报价
     *
     * @return
     * @throws Exception
     */
    List<DefProduct> getAllProductListWithPrice() throws Exception;

}
