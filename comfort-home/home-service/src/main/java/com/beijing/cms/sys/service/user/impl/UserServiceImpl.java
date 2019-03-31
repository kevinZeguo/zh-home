package com.beijing.cms.sys.service.user.impl;

import com.beijing.cms.sys.constant.Globals;
import com.beijing.cms.sys.dao.user.*;
import com.beijing.cms.sys.domain.user.*;
import com.beijing.cms.sys.service.user.UserService;
import com.beijing.cms.sys.utils.PasswordUtil;
import com.beijing.cms.sys.utils.UUIDGenerator;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mazeguo on 2017/5/28.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysDepartDao sysDepartDao;
    @Autowired
    private SysUserDepartDao sysUserDepartDao;

    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Autowired
    private SysUserDataRightDao sysUserDataRightDao;

    @Override
    public CmsUser checkUserExits(CmsUser user) throws Exception {
        //先对密码加密，然后校验密码的合法性
        String password = PasswordUtil.encrypt(user.getUserName(), user.getPassword(), PasswordUtil.getStaticSalt());
        user.setPassword(password);
        //封装查询参数
        SysUser userParam = new SysUser();
        BeanUtils.copyProperties(user, userParam);

        List<SysUser> userList = sysUserDao.selectUserByPasswdAndUserName(userParam);
        if (userList != null && userList.size() > 0) {
            CmsUser cmsUser = new CmsUser();
            //赋值cmsUser
            BeanUtils.copyProperties(userList.get(0), cmsUser);
            return cmsUser;
        }
        return null;
    }

    @Override
    public Integer queryUserCountByPage(UserQueryParam param) throws Exception {
        return sysUserDao.selectUserCountByPage(param);
    }

    @Override
    public List<CmsUser> queryUserListByPage(UserQueryParam param) throws Exception {
        return sysUserDao.selectUserListByPage(param);
    }

    @Override
    public SysUser queryUserById(Integer userId) throws Exception {
        return sysUserDao.selectById(userId);
    }

    @Override
    public List<SysUser> findUserListByRoleId(int roleId) throws Exception {
        return sysUserDao.selectListByRuleId(roleId);
    }

    @Override
    public SysUser findUserById(Integer userId) throws Exception {
        return sysUserDao.selectById(userId);
    }

    @Override
    public SysUser queryUserByRealName(String realname) throws Exception {
        if (StringUtils.isNotEmpty(realname)) {
            return sysUserDao.selectByRealName(realname.trim());
        }
        return null;
    }

    @Override
    public List<SysDepart> queryDepartList() throws Exception {
        return sysDepartDao.selectAllDepartList();
    }

    @Override
    @Transactional
    public void saveUser(SysUser user, Integer userId) throws Exception {
        user.setStatus(Globals.user_status_normal);//新增用户默认启用状态
        user.setUserKey(UUIDGenerator.generate());

        //加密密码
        String password = PasswordUtil.encrypt(user.getUserName(), user.getPassword(), PasswordUtil.getStaticSalt());
        user.setPassword(password);
        user.setCreator(userId);
        user.setModifier(userId);
        //保存用户号码
        sysUserDao.insert(user);
        //保存用户所属部门
        SysUserDepart sysUserDepart = new SysUserDepart();
        sysUserDepart.setUserId(user.getUserId());
        sysUserDepart.setDeptId(user.getDepartId());
        sysUserDepart.setCreator(userId);
        sysUserDepart.setModifier(userId);
        sysUserDepartDao.insert(sysUserDepart);

        //保存权限数据
        String roleIds = user.getRoleIds();
        if (StringUtils.isNotEmpty(roleIds)) {
            SysPermission sysPermission;
            for (String roleId : roleIds.split(",")) {
                sysPermission = new SysPermission();
                sysPermission.setCreator(userId);
                sysPermission.setModifier(userId);
                sysPermission.setRoleId(Integer.parseInt(roleId));
                sysPermission.setUserId(user.getUserId());
                sysPermissionDao.insert(sysPermission);
            }
        }

        SysUserDataRight sysUserDataRight = new SysUserDataRight();
        sysUserDataRight.setUserId(user.getUserId());
        if (user.getDataType() == null) {
            sysUserDataRight.setDataType(3);
        } else {
            sysUserDataRight.setDataType(user.getDataType());
        }
        sysUserDataRight.setDataUserIds(user.getDataUserIds());
        sysUserDataRight.setCreator(userId);
        sysUserDataRight.setModifier(userId);
        sysUserDataRightDao.insert(sysUserDataRight);
    }

    @Override
    @Transactional("geek-cms")
    public void editUser(SysUser addUser, Integer userId) throws Exception {
        addUser.setCreator(userId);
        addUser.setModifier(userId);
        sysUserDao.updateById(addUser);

        SysUserDepart sysUserDepart = new SysUserDepart();
        sysUserDepart.setUserId(addUser.getUserId());
        sysUserDepart.setModifier(userId);
        sysUserDepartDao.deleteByUserId(sysUserDepart);

        sysUserDepart.setCreator(userId);
        sysUserDepart.setModifier(userId);
        sysUserDepart.setDeptId(addUser.getDepartId());
        sysUserDepartDao.insert(sysUserDepart);

        //删除角色数据
        SysPermission sysPermission = new SysPermission();
        sysPermission.setUserId(addUser.getUserId());
        sysPermission.setModifier(userId);
        sysPermissionDao.deleteByUserId(addUser);

        //保存权限数据
        String roleIds = addUser.getRoleIds();
        if (StringUtils.isNotEmpty(roleIds)) {
            for (String roleId : roleIds.split(",")) {
                sysPermission = new SysPermission();
                sysPermission.setCreator(userId);
                sysPermission.setModifier(userId);
                sysPermission.setRoleId(Integer.parseInt(roleId));
                sysPermission.setUserId(addUser.getUserId());
                sysPermissionDao.insert(sysPermission);
            }
        }

        //数据权限
        SysUserDataRight sysUserDataRight = sysUserDataRightDao.selectByUserId(addUser.getUserId());
        if (sysUserDataRight == null) {//新增
            sysUserDataRight = new SysUserDataRight();
            sysUserDataRight.setUserId(addUser.getUserId());
            if (addUser.getDataType() == null) {
                sysUserDataRight.setDataType(3);
            } else {
                sysUserDataRight.setDataType(addUser.getDataType());
            }
            sysUserDataRight.setDataUserIds(addUser.getDataUserIds());
            sysUserDataRight.setCreator(userId);
            sysUserDataRight.setModifier(userId);
            sysUserDataRightDao.insert(sysUserDataRight);
        } else {//修改
            if (addUser.getDataType() == null) {
                sysUserDataRight.setDataType(3);
            } else {
                sysUserDataRight.setDataType(addUser.getDataType());
            }
            sysUserDataRight.setDataUserIds(addUser.getDataUserIds());
            sysUserDataRight.setModifier(userId);
            sysUserDataRightDao.updateById(sysUserDataRight);
        }

    }

    @Override
    public boolean userNameIsUsed(String userName, Integer userId) throws Exception {
        List<SysUser> users = sysUserDao.selectByUserName(userName);
        if (users == null || users.size() == 0) {
            return false;
        }

        if (users.size() > 1) {
            return true;
        }

        if (users.size() == 1) {
            if (users.get(0).getUserId().intValue() == userId) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional("geek-cms")
    public void deleteById(Integer userId, Integer operateUserId) throws Exception {
        //判断用户是否还有权限数据，如果有权限数据不允许删除
        List<SysPermission> permissions = sysPermissionDao.selectByUserId(userId);
        if (permissions != null && permissions.size() > 0) {
            throw new RuntimeException("用户存在权限数据，请清空权限数据后，重新删除!");
        }

        //删除权限数据
        SysUser sysUser = new SysUser();
        sysUser.setUserId(userId);
        sysUser.setModifier(operateUserId);
        sysPermissionDao.deleteByUserId(sysUser);
        //删除部门关联关系
        SysUserDepart sysUserDepart = new SysUserDepart();
        sysUserDepart.setUserId(userId);
        sysUserDepart.setModifier(operateUserId);
        sysUserDepartDao.deleteByUserId(sysUserDepart);
        //删除用户信息
        sysUserDao.deleteById(sysUser);
    }

    @Override
    public boolean validOldPwdIsRight(String password, Integer userId) throws Exception {
        SysUser sysUser = sysUserDao.selectById(userId);
        if (sysUser == null) {
            throw new RuntimeException("用户不存在，无法修改密码");
        }
        String encPwd = PasswordUtil.encrypt(sysUser.getUserName(), password, PasswordUtil.getStaticSalt());
        //校验密码是否正确
        if (StringUtils.equals(encPwd, sysUser.getPassword())) {
            return true;
        }
        return false;
    }

    @Override
    public void editPwd(String password, Integer userId) throws Exception {
        SysUser sysUser = this.sysUserDao.selectById(userId);
        if (sysUser == null) {
            throw new RuntimeException("用户不存在，无法修改密码");
        }
        password = PasswordUtil.encrypt(sysUser.getUserName(), password, PasswordUtil.getStaticSalt());
        sysUser.setPassword(password);
        sysUserDao.modifiyPwd(sysUser);
    }

    @Override
    public SysUser findUserByUserKey(String userKey) throws Exception {
        return sysUserDao.selectByUserKey(userKey);
    }

    @Override
    public List<SysUser> findUserListByRoleCode(String roleCode) throws Exception {
        return sysUserDao.selectUserListByRoleCode(roleCode);
    }

    @Override
    public String getUserNames(String userIds) throws Exception {
        if (StringUtils.isEmpty(userIds)) {
            return "";
        }
        String[] ids = userIds.split(",");
        StringBuffer nameBf = new StringBuffer();
        for (String id : ids) {
            SysUser user = sysUserDao.selectById(Integer.parseInt(id));
            if (user != null) {
                if (nameBf != null && nameBf.length() > 0) {
                    nameBf.append(",");
                }
                nameBf.append(user.getRealName());
            }
        }
        return nameBf.toString();
    }
}
