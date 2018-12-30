package com.zhonghua.comfortable.home.service;

import com.zhonghua.comfortable.home.domain.UserHouse;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 11:26
 * 报价计算服务
 **/
public interface QuoteCalculatorService {

    /**
     * 计算报价信息
     *
     * @param userProjectPrice
     * @return
     * @throws Exception
     */
    UserProjectPrice calculatePrice(UserProjectPrice userProjectPrice) throws Exception;


    /**
     * 计算报价
     *
     * @param userHouse
     * @param productList
     * @return
     * @throws Exception
     */
    UserProjectPrice calculatePrice(UserHouse userHouse, List<Integer> productList) throws Exception;
}
