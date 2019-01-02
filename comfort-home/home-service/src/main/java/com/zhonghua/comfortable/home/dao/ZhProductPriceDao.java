package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.DefProductPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-31 23:57
 **/
public interface ZhProductPriceDao {
    /**
     * 获取产品报价列表
     * @param productId
     * @return
     * @throws Exception
     */
    List<DefProductPrice> selectListByProductId(@Param("productId") Integer productId)throws Exception;
}
