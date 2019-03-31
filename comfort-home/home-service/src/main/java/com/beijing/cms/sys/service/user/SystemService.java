package com.beijing.cms.sys.service.user;

import com.beijing.cms.sys.domain.user.CmsUser;
import com.beijing.cms.sys.domain.user.SysDepart;
import com.beijing.cms.sys.domain.user.SysFunction;
import com.beijing.cms.sys.domain.user.SysPermission;

import java.util.List;

/**
 * Created by mazeguo on 2017/5/29.
 */
public interface SystemService {
//    /**
//     * 获取菜单数量
//     *
//     * @param requestPath
//     */
//    Long getMenuCount(String requestPath) throws Exception;

    /**
     * 校验用户是否具有指定连接权限
     *
     * @param requestPath
     * @param userId
     * @return
     * @throws Exception
     */
    boolean userHasMenuAuth(String requestPath, Integer userId) throws Exception;

    /**
     * 根据用户Id查询用户归属的部门列表
     *
     * @param userId
     * @return
     * @throws Exception
     */
    List<SysDepart> getUserDepartList(Integer userId) throws Exception;

    /**
     * 获取用户所有权限
     *
     * @param userId
     * @return
     * @throws Exception
     */
    List<SysPermission> getUserPermission(Integer userId) throws Exception;

    /**
     * 查询用户有权限的菜单
     *
     * @param userId
     * @return
     * @throws Exception
     */
    List<SysFunction> getUserHasRightMenu(Integer userId) throws Exception;

    /**
     * 根据请求URl查询请求菜单
     * @param url
     * @return
     * @throws Exception
     */
    SysFunction getMenuByUrl(String url)throws Exception;

    /**
     * 查询有权限的菜单
     * @param roleId
     * @param userId
     * @return
     */
    List<SysFunction> queryRightMenuListByRoleId(Integer roleId, Integer userId)throws Exception;

    /**
     * 保存菜单权限
     * @param roleId
     * @param functionIds
     * @param userId
     * @throws Exception
     */
    void saveMenuRight(Integer roleId, List<Integer> functionIds, Integer userId)throws Exception;

    /**
     * 获取全部菜单列表
     * @param userId
     * @return
     * @throws Exception
     */
    List<SysFunction> getAllMenu(Integer userId)throws Exception;
}
