package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Department")
public class DepartmentQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hoscode;

	@ApiModelProperty(value = "科室编号")
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	private String depname;

	@ApiModelProperty(value = "大科室编号")
	private String bigcode;

	@ApiModelProperty(value = "大科室名称")
	private String bigname;

    public DepartmentQueryVo() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getDepcode() {
        return this.depcode;
    }

    public String getDepname() {
        return this.depname;
    }

    public String getBigcode() {
        return this.bigcode;
    }

    public String getBigname() {
        return this.bigname;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public void setBigcode(String bigcode) {
        this.bigcode = bigcode;
    }

    public void setBigname(String bigname) {
        this.bigname = bigname;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DepartmentQueryVo)) return false;
        final DepartmentQueryVo other = (DepartmentQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$depcode = this.getDepcode();
        final Object other$depcode = other.getDepcode();
        if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
        final Object this$depname = this.getDepname();
        final Object other$depname = other.getDepname();
        if (this$depname == null ? other$depname != null : !this$depname.equals(other$depname)) return false;
        final Object this$bigcode = this.getBigcode();
        final Object other$bigcode = other.getBigcode();
        if (this$bigcode == null ? other$bigcode != null : !this$bigcode.equals(other$bigcode)) return false;
        final Object this$bigname = this.getBigname();
        final Object other$bigname = other.getBigname();
        if (this$bigname == null ? other$bigname != null : !this$bigname.equals(other$bigname)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DepartmentQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $depname = this.getDepname();
        result = result * PRIME + ($depname == null ? 43 : $depname.hashCode());
        final Object $bigcode = this.getBigcode();
        result = result * PRIME + ($bigcode == null ? 43 : $bigcode.hashCode());
        final Object $bigname = this.getBigname();
        result = result * PRIME + ($bigname == null ? 43 : $bigname.hashCode());
        return result;
    }

    public String toString() {
        return "DepartmentQueryVo(hoscode=" + this.getHoscode() + ", depcode=" + this.getDepcode() + ", depname=" + this.getDepname() + ", bigcode=" + this.getBigcode() + ", bigname=" + this.getBigname() + ")";
    }
}

