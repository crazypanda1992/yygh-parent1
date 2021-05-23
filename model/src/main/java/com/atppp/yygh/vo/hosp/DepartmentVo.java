package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Department")
public class DepartmentVo {

	@ApiModelProperty(value = "科室编号")
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	private String depname;

	@ApiModelProperty(value = "下级节点")
	private List<DepartmentVo> children;

    public DepartmentVo() {
    }

    public String getDepcode() {
        return this.depcode;
    }

    public String getDepname() {
        return this.depname;
    }

    public List<DepartmentVo> getChildren() {
        return this.children;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public void setChildren(List<DepartmentVo> children) {
        this.children = children;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DepartmentVo)) return false;
        final DepartmentVo other = (DepartmentVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$depcode = this.getDepcode();
        final Object other$depcode = other.getDepcode();
        if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
        final Object this$depname = this.getDepname();
        final Object other$depname = other.getDepname();
        if (this$depname == null ? other$depname != null : !this$depname.equals(other$depname)) return false;
        final Object this$children = this.getChildren();
        final Object other$children = other.getChildren();
        if (this$children == null ? other$children != null : !this$children.equals(other$children)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DepartmentVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $depname = this.getDepname();
        result = result * PRIME + ($depname == null ? 43 : $depname.hashCode());
        final Object $children = this.getChildren();
        result = result * PRIME + ($children == null ? 43 : $children.hashCode());
        return result;
    }

    public String toString() {
        return "DepartmentVo(depcode=" + this.getDepcode() + ", depname=" + this.getDepname() + ", children=" + this.getChildren() + ")";
    }
}

