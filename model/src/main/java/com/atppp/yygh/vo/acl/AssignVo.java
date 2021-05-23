package com.atppp.yygh.vo.acl;

public class AssignVo {

    private Long roleId;

    private Long[] permissionId;

    public AssignVo() {
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public Long[] getPermissionId() {
        return this.permissionId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setPermissionId(Long[] permissionId) {
        this.permissionId = permissionId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AssignVo)) return false;
        final AssignVo other = (AssignVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$roleId = this.getRoleId();
        final Object other$roleId = other.getRoleId();
        if (this$roleId == null ? other$roleId != null : !this$roleId.equals(other$roleId)) return false;
        if (!java.util.Arrays.deepEquals(this.getPermissionId(), other.getPermissionId())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AssignVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $roleId = this.getRoleId();
        result = result * PRIME + ($roleId == null ? 43 : $roleId.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getPermissionId());
        return result;
    }

    public String toString() {
        return "AssignVo(roleId=" + this.getRoleId() + ", permissionId=" + java.util.Arrays.deepToString(this.getPermissionId()) + ")";
    }
}
