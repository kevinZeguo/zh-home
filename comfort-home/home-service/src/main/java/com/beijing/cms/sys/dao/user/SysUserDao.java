package com.beijing.cms.sys.dao.user;

import com.beijing.cms.sys.domain.user.CmsUser;
import com.beijing.cms.sys.domain.user.SysUser;
import com.beijing.cms.sys.domain.user.UserQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserDao {
    int deleteById(SysUser user) throws Exception;

    int insert(SysUser record) throws Exception;

    SysUser selectById(Integer userId) throws Exception;

    int updateById(SysUser record) throws Exception;

    Integer selectUserCountByPage(UserQueryParam param) throws Exception;

    List<CmsUser> selectUserListByPage(UserQueryParam param) throws Exception;

    /**
     * 根据用户名和密码查询用户列表
     *
     * @param user
     * @return
     * @throws Exception
     */
    List<SysUser> selectUserByPasswdAndUserName(SysUser user) throws Exception;

    /**
     * 根据角色Id查询用户列表
     *
     * @param roleId
     * @return
     * @throws Exception
     */
    List<SysUser> selectListByRuleId(int roleId) throws Exception;

    /**
     * 根据用户真实名称查询用户信息
     *
     * @param realName
     * @return
     * @throws Exception
     */
    SysUser selectByRealName(String realName) throws Exception;

    /**
     * 根据用户名查询用户信息
     *
     * @param userName
     * @return
     * @throws Exception
     */
    List<SysUser> selectByUserName(String userName) throws Exception;

    /**
     * 修改用户密码
     *
     * @param sysUser
     * @throws Exception
     */
    void modifiyPwd(SysUser sysUser) throws Exception;

    /**
     * 根据用户Key查询用户信息
     *
     * @param userKey
     * @return
     * @throws Exception
     */
    SysUser selectByUserKey(@Param("userKey") String userKey) throws Exception;

    /**
     * 根据Code查询用户列表
     *
     * @param roleCode
     * @return
     * @throws Exception
     */
    List<SysUser> selectUserListByRoleCode(@Param("roleCode") String roleCode) throws Exception;

}