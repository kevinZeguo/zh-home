package com.zhonghua.comfortable.home.service.impl;

import com.zhonghua.comfortable.home.dao.ZhUserInfoDao;
import com.zhonghua.comfortable.home.domain.CusteromQueryParam;
import com.zhonghua.comfortable.home.domain.CustomerInfo;
import com.zhonghua.comfortable.home.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-03-17 17:27
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private ZhUserInfoDao zhUserInfoDao;
    @Override
    public Integer getCustomerTotalCount(CusteromQueryParam param) throws Exception {
        return zhUserInfoDao.selectUserTotalCount(param);
    }

    @Override
    public List<CustomerInfo> getCustomerListByPage(CusteromQueryParam param) throws Exception {
        List<CustomerInfo> infos = new ArrayList<>();
        return zhUserInfoDao.selectUserListByPage(param);
    }
}
