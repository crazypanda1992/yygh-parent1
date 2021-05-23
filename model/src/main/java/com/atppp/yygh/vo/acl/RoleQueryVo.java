package com.atppp.yygh.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 角色查询实体
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "角色查询实体")
public class RoleQueryVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "角色名称")
	private String roleName;

    public RoleQueryVo() {
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleQueryVo)) return false;
        final RoleQueryVo other = (RoleQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$roleName = this.getRoleName();
        final Object other$roleName = other.getRoleName();
        if (this$roleName == null ? other$roleName != null : !this$roleName.equals(other$roleName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $roleName = this.getRoleName();
        result = result * PRIME + ($roleName == null ? 43 : $roleName.hashCode());
        return result;
    }

    public String toString() {
        return "RoleQueryVo(roleName=" + this.getRoleName() + ")";
    }
}

