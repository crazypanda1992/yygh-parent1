package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModelProperty;

public class HospitalSetQueryVo {

    @ApiModelProperty(value = "医院名称")
    private String hosname;

    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    public HospitalSetQueryVo() {
    }

    public String getHosname() {
        return this.hosname;
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HospitalSetQueryVo)) return false;
        final HospitalSetQueryVo other = (HospitalSetQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hosname = this.getHosname();
        final Object other$hosname = other.getHosname();
        if (this$hosname == null ? other$hosname != null : !this$hosname.equals(other$hosname)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HospitalSetQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hosname = this.getHosname();
        result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        return result;
    }

    public String toString() {
        return "HospitalSetQueryVo(hosname=" + this.getHosname() + ", hoscode=" + this.getHoscode() + ")";
    }
}
