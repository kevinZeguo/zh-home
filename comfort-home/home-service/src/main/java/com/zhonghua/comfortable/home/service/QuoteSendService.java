package com.zhonghua.comfortable.home.service;

import com.zhonghua.comfortable.home.domain.UserHouse;
import com.zhonghua.comfortable.home.domain.UserProjectPrice;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-30 22:53
 **/
public interface QuoteSendService {
    /**
     * 发送报价
     *
     * @param projectPrice
     * @param userhousee
     * @throws Exception
     */
    void sendQuoteToUser(UserProjectPrice projectPrice, UserHouse userhousee) throws Exception;
}
