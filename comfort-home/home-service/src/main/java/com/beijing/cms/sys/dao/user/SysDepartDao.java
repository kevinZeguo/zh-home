package com.beijing.cms.sys.dao.user;

import com.beijing.cms.sys.domain.user.SysDepart;

import java.util.List;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-03-24 14:13
 **/
public interface SysDepartDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int deleteById(Integer departId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int insert(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int insertSelective(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    SysDepart selectById(Integer departId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int updateByIdSelective(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int updateByIdWithBLOBs(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbggenerated
     */
    int updateById(SysDepart record);

    /**
     * 查询所有部门列表
     *
     * @return
     * @throws Exception
     */
    List<SysDepart> selectAllDepartList() throws Exception;

}