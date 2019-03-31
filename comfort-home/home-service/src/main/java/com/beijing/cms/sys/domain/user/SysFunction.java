package com.beijing.cms.sys.domain.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFunction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_id
     *
     * @mbggenerated
     */
    private Integer functionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_iframe
     *
     * @mbggenerated
     */
    private Short functionIframe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_level
     *
     * @mbggenerated
     */
    private Short functionLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_name
     *
     * @mbggenerated
     */
    private String functionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_order
     *
     * @mbggenerated
     */
    private String functionOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.function_url
     *
     * @mbggenerated
     */
    private String functionUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.parent_function_id
     *
     * @mbggenerated
     */
    private Integer parentFunctionId;
    private Integer isOpen = 0;

    private String functionMenuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.icon_id
     *
     * @mbggenerated
     */
    private String iconId;
    private String iconName;
    private String iconPath;

    private String iconclas;
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.functiontype
     *
     * @mbggenerated
     */
    private Short functiontype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.creator
     *
     * @mbggenerated
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.modifier
     *
     * @mbggenerated
     */
    private Integer modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.modified
     *
     * @mbggenerated
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_function.deleted
     *
     * @mbggenerated
     */
    private Integer deleted;

    /**
     * 子菜单Id列表
     */
    private String childMenuIds;

    private Boolean isParent;
    private Boolean checked;

    /**
     * 子菜单列表
     */
    private List<SysFunction> childMenuList = new ArrayList<>();

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_id
     *
     * @return the value of sys_function.function_id
     * @mbggenerated
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_id
     *
     * @param functionId the value for sys_function.function_id
     * @mbggenerated
     */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_iframe
     *
     * @return the value of sys_function.function_iframe
     * @mbggenerated
     */
    public Short getFunctionIframe() {
        return functionIframe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_iframe
     *
     * @param functionIframe the value for sys_function.function_iframe
     * @mbggenerated
     */
    public void setFunctionIframe(Short functionIframe) {
        this.functionIframe = functionIframe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_level
     *
     * @return the value of sys_function.function_level
     * @mbggenerated
     */
    public Short getFunctionLevel() {
        return functionLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_level
     *
     * @param functionLevel the value for sys_function.function_level
     * @mbggenerated
     */
    public void setFunctionLevel(Short functionLevel) {
        this.functionLevel = functionLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_name
     *
     * @return the value of sys_function.function_name
     * @mbggenerated
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_name
     *
     * @param functionName the value for sys_function.function_name
     * @mbggenerated
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_order
     *
     * @return the value of sys_function.function_order
     * @mbggenerated
     */
    public String getFunctionOrder() {
        return functionOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_order
     *
     * @param functionOrder the value for sys_function.function_order
     * @mbggenerated
     */
    public void setFunctionOrder(String functionOrder) {
        this.functionOrder = functionOrder == null ? null : functionOrder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.function_url
     *
     * @return the value of sys_function.function_url
     * @mbggenerated
     */
    public String getFunctionUrl() {
        return functionUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.function_url
     *
     * @param functionUrl the value for sys_function.function_url
     * @mbggenerated
     */
    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.parent_function_id
     *
     * @return the value of sys_function.parent_function_id
     * @mbggenerated
     */
    public Integer getParentFunctionId() {
        return parentFunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.parent_function_id
     *
     * @param parentFunctionId the value for sys_function.parent_function_id
     * @mbggenerated
     */
    public void setParentFunctionId(Integer parentFunctionId) {
        this.parentFunctionId = parentFunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.icon_id
     *
     * @return the value of sys_function.icon_id
     * @mbggenerated
     */
    public String getIconId() {
        return iconId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.icon_id
     *
     * @param iconId the value for sys_function.icon_id
     * @mbggenerated
     */
    public void setIconId(String iconId) {
        this.iconId = iconId == null ? null : iconId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.functiontype
     *
     * @return the value of sys_function.functiontype
     * @mbggenerated
     */
    public Short getFunctiontype() {
        return functiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.functiontype
     *
     * @param functiontype the value for sys_function.functiontype
     * @mbggenerated
     */
    public void setFunctiontype(Short functiontype) {
        this.functiontype = functiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.creator
     *
     * @return the value of sys_function.creator
     * @mbggenerated
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.creator
     *
     * @param creator the value for sys_function.creator
     * @mbggenerated
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.created
     *
     * @return the value of sys_function.created
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.created
     *
     * @param created the value for sys_function.created
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.modifier
     *
     * @return the value of sys_function.modifier
     * @mbggenerated
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.modifier
     *
     * @param modifier the value for sys_function.modifier
     * @mbggenerated
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.modified
     *
     * @return the value of sys_function.modified
     * @mbggenerated
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.modified
     *
     * @param modified the value for sys_function.modified
     * @mbggenerated
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_function.deleted
     *
     * @return the value of sys_function.deleted
     * @mbggenerated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_function.deleted
     *
     * @param deleted the value for sys_function.deleted
     * @mbggenerated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getChildMenuIds() {
        return childMenuIds;
    }

    public void setChildMenuIds(String childMenuIds) {
        this.childMenuIds = childMenuIds;
    }

    public List<SysFunction> getChildMenuList() {
        return childMenuList;
    }

    public void setChildMenuList(List<SysFunction> childMenuList) {
        this.childMenuList = childMenuList;
    }

    /**
     * 校验是否存在子菜单
     *
     * @return
     */
    public boolean hasSubFunction() {
        if (childMenuIds != null && !"".equals(childMenuIds) && childMenuIds.split(",").length > 0) {
            return true;
        }
        return false;
    }

    public String getIconclas() {
        return iconclas;
    }

    public void setIconclas(String iconclas) {
        this.iconclas = iconclas;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public String getFunctionMenuName() {
        return functionMenuName;
    }

    public void setFunctionMenuName(String functionMenuName) {
        this.functionMenuName = functionMenuName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}