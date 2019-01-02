package com.zhonghua.comfortable.home.dao;

import com.zhonghua.comfortable.home.domain.DefProductPart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2018-12-31 23:57
 **/
public interface ZhProductPartDao {
    /**
     * 查询配件列表
     * @param productId
     * @return
     * @throws Exception
     */
    List<DefProductPart> selectListByProductId(@Param("productId") Integer productId)throws Exception;
}
