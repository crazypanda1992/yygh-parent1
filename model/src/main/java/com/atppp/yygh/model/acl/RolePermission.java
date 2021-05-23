package com.atppp.yygh.model.acl;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 角色权限
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "角色权限")
@TableName("acl_role_permission")
public class RolePermission extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "roleid")
	@TableField("role_id")
	private Long roleId;

	@ApiModelProperty(value = "permissionId")
	@TableField("permission_id")
	private Long permissionId;

    public RolePermission() {
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public Long getPermissionId() {
        return this.permissionId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RolePermission)) return false;
        final RolePermission other = (RolePermission) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$roleId = this.getRoleId();
        final Object other$roleId = other.getRoleId();
        if (this$roleId == null ? other$roleId != null : !this$roleId.equals(other$roleId)) return false;
        final Object this$permissionId = this.getPermissionId();
        final Object other$permissionId = other.getPermissionId();
        if (this$permissionId == null ? other$permissionId != null : !this$permissionId.equals(other$permissionId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RolePermission;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $roleId = this.getRoleId();
        result = result * PRIME + ($roleId == null ? 43 : $roleId.hashCode());
        final Object $permissionId = this.getPermissionId();
        result = result * PRIME + ($permissionId == null ? 43 : $permissionId.hashCode());
        return result;
    }

    public String toString() {
        return "RolePermission(roleId=" + this.getRoleId() + ", permissionId=" + this.getPermissionId() + ")";
    }
}

