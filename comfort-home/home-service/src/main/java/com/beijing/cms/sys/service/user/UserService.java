package com.beijing.cms.sys.service.user;


import com.beijing.cms.sys.domain.user.CmsUser;
import com.beijing.cms.sys.domain.user.SysDepart;
import com.beijing.cms.sys.domain.user.SysUser;
import com.beijing.cms.sys.domain.user.UserQueryParam;

import java.util.List;

/**
 * Created by mazeguo on 2017/5/28.
 */
public interface UserService {
    /**
     * 校验用户是否存在
     *
     * @param user
     * @return
     * @throws Exception
     */
    CmsUser checkUserExits(CmsUser user) throws Exception;

    /**
     * 查询用户总量
     *
     * @param param
     * @return
     * @throws Exception
     */
    Integer queryUserCountByPage(UserQueryParam param) throws Exception;

    /**
     * 分页查询用户列表
     *
     * @param param
     * @return
     * @throws Exception
     */
    List<CmsUser> queryUserListByPage(UserQueryParam param) throws Exception;

    /**
     * 查询用户信息
     *
     * @param userId
     * @return
     * @throws Exception
     */
    SysUser queryUserById(Integer userId) throws Exception;

    /**
     * 根据角色Id查询用户列表
     *
     * @param ruleId
     * @return
     * @throws Exception
     */
    List<SysUser> findUserListByRoleId(int roleId) throws Exception;

    /**
     * 查询用户信息
     *
     * @param userId
     * @return
     * @throws Exception
     */
    SysUser findUserById(Integer userId) throws Exception;

    /**
     * 根据用户名称查询用户信息
     *
     * @param realname
     * @return
     * @throws Exception
     */
    SysUser queryUserByRealName(String realname) throws Exception;

    /**
     * 查询部门列表
     *
     * @return
     * @throws Exception
     */
    List<SysDepart> queryDepartList() throws Exception;

    /**
     * 保存用户信息
     *
     * @param addUser
     * @param userId
     * @throws Exception
     */
    void saveUser(SysUser addUser, Integer userId) throws Exception;

    /**
     * 修改用户信息
     *
     * @param addUser
     * @param userId
     * @throws Exception
     */
    void editUser(SysUser addUser, Integer userId) throws Exception;

    /**
     * 校验用户名是否已经存在
     *
     * @param userName
     * @param userId
     * @return
     * @throws Exception
     */
    boolean userNameIsUsed(String userName, Integer userId) throws Exception;

    /**
     * 删除用户信息
     *
     * @param userId
     * @param operateUserId
     * @throws Exception
     */
    void deleteById(Integer userId, Integer operateUserId) throws Exception;

    /**
     * 校验原密码是否正确
     *
     * @param password
     * @param userId
     * @return
     * @throws Exception
     */
    boolean validOldPwdIsRight(String password, Integer userId) throws Exception;

    /**
     * 修改密码
     *
     * @param password
     * @param userId
     * @throws Exception
     */
    void editPwd(String password, Integer userId) throws Exception;

    /**
     * 根据用户Key查询用户信息
     *
     * @param userKey
     * @return
     * @throws Exception
     */
    SysUser findUserByUserKey(String userKey) throws Exception;

    /**
     * 根据角色code查询用户列表
     * @param engineer
     * @return
     * @throws Exception
     */
    List<SysUser> findUserListByRoleCode(String engineer)throws Exception;

    /**
     * 根据用户id获取用户真实名称
     * @param userIds
     * @return
     */
    String getUserNames(String userIds)throws Exception;
}
