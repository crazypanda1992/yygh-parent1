package com.atppp.yygh.model.acl;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "用户角色")
@TableName("acl_user_role")
public class UserRole extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "角色id")
	@TableField("role_id")
	private Long roleId;

	@ApiModelProperty(value = "用户id")
	@TableField("user_id")
	private Long userId;

	public UserRole() {
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof UserRole)) return false;
		final UserRole other = (UserRole) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$roleId = this.getRoleId();
		final Object other$roleId = other.getRoleId();
		if (this$roleId == null ? other$roleId != null : !this$roleId.equals(other$roleId)) return false;
		final Object this$userId = this.getUserId();
		final Object other$userId = other.getUserId();
		if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof UserRole;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $roleId = this.getRoleId();
		result = result * PRIME + ($roleId == null ? 43 : $roleId.hashCode());
		final Object $userId = this.getUserId();
		result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
		return result;
	}

	public String toString() {
		return "UserRole(roleId=" + this.getRoleId() + ", userId=" + this.getUserId() + ")";
	}
}

