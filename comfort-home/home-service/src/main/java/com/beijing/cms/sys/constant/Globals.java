package com.beijing.cms.sys.constant;

/**
 * Created by mazeguo on 2017/5/29.
 */
public class Globals {
    //账号状态正常
    public static final Integer user_status_normal = 1;//正常
    public static final Integer user_status_invalid = 0;//失效

    /**
     * 权限类型
     */
    public static final Short Function_TYPE_PAGE = 0;//页面（菜单：菜单类型）
    public static final Short Function_TYPE_FROM = 1;//表单/或者弹出（菜单：访问类型）

    /**
     * 保存用户到SESSION
     */
    public static final String USER_SESSION="USER_SESSION";
    /**
     * 人员类型
     */
    public static final Short User_Normal=1;//正常
    public static final Short User_Forbidden=0;//禁用
    public static final Short User_ADMIN=-1;//超级管理员

    /**
     * 逻辑删除标记
     */
    /**
     * 删除
     */
    public static final Short Delete_Forbidden=1;
    /**
     * 正常
     */
    public static final Short Delete_Normal=0;

    /**
     *日志级别定义
     */
    public static final Short Log_Leavel_INFO=1;
    public static final Short Log_Leavel_WARRING=2;
    public static final Short Log_Leavel_ERROR=3;
    /**
     * 日志类型
     */
    public static final Short Log_Type_LOGIN=1; //登陆
    public static final Short Log_Type_EXIT=2;  //退出
    public static final Short Log_Type_INSERT=3; //插入
    public static final Short Log_Type_DEL=4; //删除
    public static final Short Log_Type_UPDATE=5; //更新
    public static final Short Log_Type_UPLOAD=6; //上传
    public static final Short Log_Type_OTHER=7; //其他


    /**
     * 词典分组定义
     */
    public static final String TypeGroup_Database="database";//数据表分类

    /**
     * 权限等级
     */
    public static final Short Function_Leave_ONE=0;//一级权限
    public static final Short Function_Leave_TWO=1;//二级权限

    /**
     * 权限等级前缀
     */
    public static final String Function_Order_ONE="ofun";//一级权限
    public static final String Function_Order_TWO="tfun";//二级权限
    /**
     * 没有勾选的操作code
     */
    public static final String NOAUTO_OPERATIONCODES ="noauto_operationCodes";
    /**
     * 勾选了的操作code
     */
    public static final String OPERATIONCODES ="operationCodes";


    /**
     * 权限类型
     */
    public static final Short OPERATION_TYPE_HIDE = 0;//页面
    public static final Short OPERATION_TYPE_DISABLED = 1;//表单/或者弹出

}
