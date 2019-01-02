package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.DefProduct;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-31 23:57
 **/
public interface ZhProductDao {
    /**
     * 查询产品基本信息
     *
     * @return
     * @throws Exception
     */
    List<DefProduct> selectProductBaseInfoList() throws Exception;

    /**
     *  产品列表
     * @return
     * @throws Exception
     */
    List<DefProduct> selectAllProductList()throws Exception;

}
