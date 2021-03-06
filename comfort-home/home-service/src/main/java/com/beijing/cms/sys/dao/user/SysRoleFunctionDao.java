package com.beijing.cms.sys.dao.user;

import com.beijing.cms.sys.domain.user.SysFunction;
import com.beijing.cms.sys.domain.user.SysRoleFunction;

import java.util.List;

public interface SysRoleFunctionDao {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function
     *
     * @mbggenerated
     */
    int insert(SysRoleFunction record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function
     *
     * @mbggenerated
     */
    SysRoleFunction selectById(Integer roleFuncId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function
     *
     * @mbggenerated
     */
    int updateById(SysRoleFunction record);

    /**
     * 查询菜单及对应权限信息
     *
     * @param roleId
     * @return
     * @throws Exception
     */
    List<SysFunction> selectRightMenuListByRoleId(Integer roleId) throws Exception;

    /**
     * 根据角色Id删除权限数据
     * @param sysRoleFunction
     * @throws Exception
     */
    void deleteByRoleId(SysRoleFunction sysRoleFunction)throws Exception;
}