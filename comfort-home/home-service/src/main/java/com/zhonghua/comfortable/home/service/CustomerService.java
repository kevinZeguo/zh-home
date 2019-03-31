package com.zhonghua.comfortable.home.service;

import com.zhonghua.comfortable.home.domain.CusteromQueryParam;
import com.zhonghua.comfortable.home.domain.CustomerInfo;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-03-17 17:27
 **/
public interface CustomerService {
    /**
     * 查询用户总量
     *
     * @param param
     * @return
     * @throws Exception
     */
    Integer getCustomerTotalCount(CusteromQueryParam param) throws Exception;

    /**
     * 查询用户列表
     *
     * @param param
     * @return
     * @throws Exception
     */
    List<CustomerInfo> getCustomerListByPage(CusteromQueryParam param) throws Exception;
}
