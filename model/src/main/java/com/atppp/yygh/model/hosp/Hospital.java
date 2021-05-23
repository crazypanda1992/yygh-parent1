package com.atppp.yygh.model.hosp;

import com.alibaba.fastjson.JSONObject;
import com.atppp.yygh.model.base.BaseMongoEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * Hospital
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "Hospital")
@Document("Hospital")
public class Hospital extends BaseMongoEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "医院编号")
	@Indexed(unique = true) //唯一索引
	private String hoscode;

	@ApiModelProperty(value = "医院名称")
	@Indexed //普通索引
	private String hosname;

	@ApiModelProperty(value = "医院类型")
	private String hostype;

	@ApiModelProperty(value = "省code")
	private String provinceCode;

	@ApiModelProperty(value = "市code")
	private String cityCode;

	@ApiModelProperty(value = "区code")
	private String districtCode;

	@ApiModelProperty(value = "详情地址")
	private String address;

	@ApiModelProperty(value = "医院logo")
	private String logoData;

	@ApiModelProperty(value = "医院简介")
	private String intro;

	@ApiModelProperty(value = "坐车路线")
	private String route;

	@ApiModelProperty(value = "状态 0：未上线 1：已上线")
	private Integer status;

	//预约规则
	@ApiModelProperty(value = "预约规则")
	private BookingRule bookingRule;

    public Hospital() {
    }

    public void setBookingRule(String bookingRule) {
		this.bookingRule = JSONObject.parseObject(bookingRule, BookingRule.class);
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

    public String getAddress() {
        return this.address;
    }

    public String getLogoData() {
        return this.logoData;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getRoute() {
        return this.route;
    }

    public Integer getStatus() {
        return this.status;
    }

    public BookingRule getBookingRule() {
        return this.bookingRule;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLogoData(String logoData) {
        this.logoData = logoData;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Hospital)) return false;
        final Hospital other = (Hospital) o;
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
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$logoData = this.getLogoData();
        final Object other$logoData = other.getLogoData();
        if (this$logoData == null ? other$logoData != null : !this$logoData.equals(other$logoData)) return false;
        final Object this$intro = this.getIntro();
        final Object other$intro = other.getIntro();
        if (this$intro == null ? other$intro != null : !this$intro.equals(other$intro)) return false;
        final Object this$route = this.getRoute();
        final Object other$route = other.getRoute();
        if (this$route == null ? other$route != null : !this$route.equals(other$route)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$bookingRule = this.getBookingRule();
        final Object other$bookingRule = other.getBookingRule();
        if (this$bookingRule == null ? other$bookingRule != null : !this$bookingRule.equals(other$bookingRule))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Hospital;
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
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $logoData = this.getLogoData();
        result = result * PRIME + ($logoData == null ? 43 : $logoData.hashCode());
        final Object $intro = this.getIntro();
        result = result * PRIME + ($intro == null ? 43 : $intro.hashCode());
        final Object $route = this.getRoute();
        result = result * PRIME + ($route == null ? 43 : $route.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $bookingRule = this.getBookingRule();
        result = result * PRIME + ($bookingRule == null ? 43 : $bookingRule.hashCode());
        return result;
    }

    public String toString() {
        return "Hospital(hoscode=" + this.getHoscode() + ", hosname=" + this.getHosname() + ", hostype=" + this.getHostype() + ", provinceCode=" + this.getProvinceCode() + ", cityCode=" + this.getCityCode() + ", districtCode=" + this.getDistrictCode() + ", address=" + this.getAddress() + ", logoData=" + this.getLogoData() + ", intro=" + this.getIntro() + ", route=" + this.getRoute() + ", status=" + this.getStatus() + ", bookingRule=" + this.getBookingRule() + ")";
    }
}

