package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "Hospital")
public class HospitalQueryVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "医院编号")
	private String hoscode;

	@ApiModelProperty(value = "医院名称")
	private String hosname;

	@ApiModelProperty(value = "医院类型")
	private String hostype;

	@ApiModelProperty(value = "省code")
	private String provinceCode;

	@ApiModelProperty(value = "市code")
	private String cityCode;

	@ApiModelProperty(value = "区code")
	private String districtCode;

	@ApiModelProperty(value = "状态")
	private Integer status;

    public HospitalQueryVo() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getHosname() {
        return this.hosname;
    }

    public String getHostype() {
        return this.hostype;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public void setHostype(String hostype) {
        this.hostype = hostype;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HospitalQueryVo)) return false;
        final HospitalQueryVo other = (HospitalQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$hosname = this.getHosname();
        final Object other$hosname = other.getHosname();
        if (this$hosname == null ? other$hosname != null : !this$hosname.equals(other$hosname)) return false;
        final Object this$hostype = this.getHostype();
        final Object other$hostype = other.getHostype();
        if (this$hostype == null ? other$hostype != null : !this$hostype.equals(other$hostype)) return false;
        final Object this$provinceCode = this.getProvinceCode();
        final Object other$provinceCode = other.getProvinceCode();
        if (this$provinceCode == null ? other$provinceCode != null : !this$provinceCode.equals(other$provinceCode))
            return false;
        final Object this$cityCode = this.getCityCode();
        final Object other$cityCode = other.getCityCode();
        if (this$cityCode == null ? other$cityCode != null : !this$cityCode.equals(other$cityCode)) return false;
        final Object this$districtCode = this.getDistrictCode();
        final Object other$districtCode = other.getDistrictCode();
        if (this$districtCode == null ? other$districtCode != null : !this$districtCode.equals(other$districtCode))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HospitalQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $hosname = this.getHosname();
        result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
        final Object $hostype = this.getHostype();
        result = result * PRIME + ($hostype == null ? 43 : $hostype.hashCode());
        final Object $provinceCode = this.getProvinceCode();
        result = result * PRIME + ($provinceCode == null ? 43 : $provinceCode.hashCode());
        final Object $cityCode = this.getCityCode();
        result = result * PRIME + ($cityCode == null ? 43 : $cityCode.hashCode());
        final Object $districtCode = this.getDistrictCode();
        result = result * PRIME + ($districtCode == null ? 43 : $districtCode.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "HospitalQueryVo(hoscode=" + this.getHoscode() + ", hosname=" + this.getHosname() + ", hostype=" + this.getHostype() + ", provinceCode=" + this.getProvinceCode() + ", cityCode=" + this.getCityCode() + ", districtCode=" + this.getDistrictCode() + ", status=" + this.getStatus() + ")";
    }
}

