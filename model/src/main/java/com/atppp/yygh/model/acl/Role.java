package com.atppp.yygh.model.acl;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "角色")
@TableName("acl_role")
public class Role extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "角色名称")
	@TableField("role_name")
	private String roleName;

	@ApiModelProperty(value = "备注")
	@TableField("remark")
	private String remark;

	public Role() {
	}

	public String getRoleName() {
		return this.roleName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Role)) return false;
		final Role other = (Role) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$roleName = this.getRoleName();
		final Object other$roleName = other.getRoleName();
		if (this$roleName == null ? other$roleName != null : !this$roleName.equals(other$roleName)) return false;
		final Object this$remark = this.getRemark();
		final Object other$remark = other.getRemark();
		if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Role;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $roleName = this.getRoleName();
		result = result * PRIME + ($roleName == null ? 43 : $roleName.hashCode());
		final Object $remark = this.getRemark();
		result = result * PRIME + ($remark == null ? 43 : $remark.hashCode());
		return result;
	}

	public String toString() {
		return "Role(roleName=" + this.getRoleName() + ", remark=" + this.getRemark() + ")";
	}
}

