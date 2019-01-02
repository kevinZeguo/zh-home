package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.UserChooseProduct;
import com.zhonghua.comfortable.home.domain.UserHouse;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-31 23:58
 **/
public interface ZhUserInfoDao {
    /**
     * 保存用户信息
     *
     * @param userhouse
     * @throws Exception
     */
    void insert(UserHouse userhouse) throws Exception;


}
