package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.SmsContent;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-01-01 00:00
 **/
public interface ZhSmsSendDao {
    /**
     * 保存短信内容
     *
     * @param content
     * @throws Exception
     */
    void insert(SmsContent content) throws Exception;

    /**
     * 更新状态信息
     *
     * @param content
     * @throws Exception
     */
    void updateStatusById(SmsContent content) throws Exception;
}
