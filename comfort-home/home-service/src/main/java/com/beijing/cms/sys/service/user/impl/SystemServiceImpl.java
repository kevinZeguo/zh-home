package com.beijing.cms.sys.service.user.impl;

import com.beijing.cms.sys.dao.user.SysFunctionDao;
import com.beijing.cms.sys.dao.user.SysRoleFunctionDao;
import com.beijing.cms.sys.dao.user.SysUserDao;
import com.beijing.cms.sys.domain.user.SysDepart;
import com.beijing.cms.sys.domain.user.SysFunction;
import com.beijing.cms.sys.domain.user.SysPermission;
import com.beijing.cms.sys.domain.user.SysRoleFunction;
import com.beijing.cms.sys.service.user.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mazeguo on 2017/5/29.
 */
@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysFunctionDao sysFunctionDao;

    @Autowired
    private SysRoleFunctionDao sysRoleFunctionDao;

//    @Override
//    public Long getMenuCount(String functionUrl) throws Exception {
//        return sysFunctionDao.selectByFunctionUrl(functionUrl);
//    }

    @Override
    public boolean userHasMenuAuth(String functionUrl, Integer userId) throws Exception {
        SysFunction function = new SysFunction();
        function.setFunctionUrl(functionUrl);
        List<SysFunction> functionList = sysFunctionDao.selectAllFunctionList();
        return true;
    }

    @Override
    public List<SysDepart> getUserDepartList(Integer userId) throws Exception {
        return null;
    }

    @Override
    public List<SysPermission> getUserPermission(Integer userId) throws Exception {
        return null;
    }

    @Override
    public List<SysFunction> getUserHasRightMenu(Integer userId) throws Exception {
        List<SysFunction> functionList = sysFunctionDao.selectFuncListByAuth(userId);
        return functionList;
    }

    @Override
    public SysFunction getMenuByUrl(String url) throws Exception {
        return sysFunctionDao.selectByFunctionUrl(url);
    }

    @Override
    public List<SysFunction> queryRightMenuListByRoleId(Integer roleId, Integer userId) throws Exception {
        return sysRoleFunctionDao.selectRightMenuListByRoleId(roleId);
    }

    @Override
    public void saveMenuRight(Integer roleId, List<Integer> functionIds, Integer userId) throws Exception {
        //删除已有的菜单权限
        SysRoleFunction sysRoleFunction = new SysRoleFunction();
        sysRoleFunction.setRoleId(roleId);
        sysRoleFunction.setModifier(userId);
        sysRoleFunctionDao.deleteByRoleId(sysRoleFunction);
        //保存新的菜单权限
        if (functionIds != null && functionIds.size() > 0) {
            for (Integer functionId : functionIds) {
                sysRoleFunction = new SysRoleFunction();
                sysRoleFunction.setCreator(userId);
                sysRoleFunction.setRoleId(roleId);
                sysRoleFunction.setFunctionId(functionId);
                sysRoleFunction.setModifier(userId);
                sysRoleFunctionDao.insert(sysRoleFunction);

            }
        }

    }

    @Override
    public List<SysFunction> getAllMenu(Integer userId) throws Exception {
        List<SysFunction> functionList = sysFunctionDao.selectAllFunctionList();
        return functionList;
    }
}
