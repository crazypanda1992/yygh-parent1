package com.atppp.yygh.model.user;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * Patient
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "Patient")
@TableName("patient")
public class Patient extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户id")
	@TableField("user_id")
	private Long userId;

	@ApiModelProperty(value = "姓名")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "证件类型")
	@TableField("certificates_type")
	private String certificatesType;

	@ApiModelProperty(value = "证件编号")
	@TableField("certificates_no")
	private String certificatesNo;

	@ApiModelProperty(value = "性别")
	@TableField("sex")
	private Integer sex;

	@ApiModelProperty(value = "出生年月")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@TableField("birthdate")
	private Date birthdate;

	@ApiModelProperty(value = "手机")
	@TableField("phone")
	private String phone;

	@ApiModelProperty(value = "是否结婚")
	@TableField("is_marry")
	private Integer isMarry;

	@ApiModelProperty(value = "省code")
	@TableField("province_code")
	private String provinceCode;

	@ApiModelProperty(value = "市code")
	@TableField("city_code")
	private String cityCode;

	@ApiModelProperty(value = "区code")
	@TableField("district_code")
	private String districtCode;

	@ApiModelProperty(value = "详情地址")
	@TableField("address")
	private String address;

	@ApiModelProperty(value = "联系人姓名")
	@TableField("contacts_name")
	private String contactsName;

	@ApiModelProperty(value = "联系人证件类型")
	@TableField("contacts_certificates_type")
	private String contactsCertificatesType;

	@ApiModelProperty(value = "联系人证件号")
	@TableField("contacts_certificates_no")
	private String contactsCertificatesNo;

	@ApiModelProperty(value = "联系人手机")
	@TableField("contacts_phone")
	private String contactsPhone;

	@ApiModelProperty(value = "是否有医保")
	@TableField("is_insure")
	private Integer isInsure;

	@ApiModelProperty(value = "就诊卡")
	@TableField("card_no")
	private String cardNo;

	@ApiModelProperty(value = "状态（0：默认 1：已认证）")
	@TableField("status")
	private String status;

    public Patient() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public String getCertificatesType() {
        return this.certificatesType;
    }

    public String getCertificatesNo() {
        return this.certificatesNo;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public String getPhone() {
        return this.phone;
    }

    public Integer getIsMarry() {
        return this.isMarry;
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

    public String getContactsName() {
        return this.contactsName;
    }

    public String getContactsCertificatesType() {
        return this.contactsCertificatesType;
    }

    public String getContactsCertificatesNo() {
        return this.contactsCertificatesNo;
    }

    public String getContactsPhone() {
        return this.contactsPhone;
    }

    public Integer getIsInsure() {
        return this.isInsure;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCertificatesType(String certificatesType) {
        this.certificatesType = certificatesType;
    }

    public void setCertificatesNo(String certificatesNo) {
        this.certificatesNo = certificatesNo;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIsMarry(Integer isMarry) {
        this.isMarry = isMarry;
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

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public void setContactsCertificatesType(String contactsCertificatesType) {
        this.contactsCertificatesType = contactsCertificatesType;
    }

    public void setContactsCertificatesNo(String contactsCertificatesNo) {
        this.contactsCertificatesNo = contactsCertificatesNo;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public void setIsInsure(Integer isInsure) {
        this.isInsure = isInsure;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Patient)) return false;
        final Patient other = (Patient) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$certificatesType = this.getCertificatesType();
        final Object other$certificatesType = other.getCertificatesType();
        if (this$certificatesType == null ? other$certificatesType != null : !this$certificatesType.equals(other$certificatesType))
            return false;
        final Object this$certificatesNo = this.getCertificatesNo();
        final Object other$certificatesNo = other.getCertificatesNo();
        if (this$certificatesNo == null ? other$certificatesNo != null : !this$certificatesNo.equals(other$certificatesNo))
            return false;
        final Object this$sex = this.getSex();
        final Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final Object this$birthdate = this.getBirthdate();
        final Object other$birthdate = other.getBirthdate();
        if (this$birthdate == null ? other$birthdate != null : !this$birthdate.equals(other$birthdate)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$isMarry = this.getIsMarry();
        final Object other$isMarry = other.getIsMarry();
        if (this$isMarry == null ? other$isMarry != null : !this$isMarry.equals(other$isMarry)) return false;
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
        final Object this$contactsName = this.getContactsName();
        final Object other$contactsName = other.getContactsName();
        if (this$contactsName == null ? other$contactsName != null : !this$contactsName.equals(other$contactsName))
            return false;
        final Object this$contactsCertificatesType = this.getContactsCertificatesType();
        final Object other$contactsCertificatesType = other.getContactsCertificatesType();
        if (this$contactsCertificatesType == null ? other$contactsCertificatesType != null : !this$contactsCertificatesType.equals(other$contactsCertificatesType))
            return false;
        final Object this$contactsCertificatesNo = this.getContactsCertificatesNo();
        final Object other$contactsCertificatesNo = other.getContactsCertificatesNo();
        if (this$contactsCertificatesNo == null ? other$contactsCertificatesNo != null : !this$contactsCertificatesNo.equals(other$contactsCertificatesNo))
            return false;
        final Object this$contactsPhone = this.getContactsPhone();
        final Object other$contactsPhone = other.getContactsPhone();
        if (this$contactsPhone == null ? other$contactsPhone != null : !this$contactsPhone.equals(other$contactsPhone))
            return false;
        final Object this$isInsure = this.getIsInsure();
        final Object other$isInsure = other.getIsInsure();
        if (this$isInsure == null ? other$isInsure != null : !this$isInsure.equals(other$isInsure)) return false;
        final Object this$cardNo = this.getCardNo();
        final Object other$cardNo = other.getCardNo();
        if (this$cardNo == null ? other$cardNo != null : !this$cardNo.equals(other$cardNo)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Patient;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $certificatesType = this.getCertificatesType();
        result = result * PRIME + ($certificatesType == null ? 43 : $certificatesType.hashCode());
        final Object $certificatesNo = this.getCertificatesNo();
        result = result * PRIME + ($certificatesNo == null ? 43 : $certificatesNo.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $birthdate = this.getBirthdate();
        result = result * PRIME + ($birthdate == null ? 43 : $birthdate.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $isMarry = this.getIsMarry();
        result = result * PRIME + ($isMarry == null ? 43 : $isMarry.hashCode());
        final Object $provinceCode = this.getProvinceCode();
        result = result * PRIME + ($provinceCode == null ? 43 : $provinceCode.hashCode());
        final Object $cityCode = this.getCityCode();
        result = result * PRIME + ($cityCode == null ? 43 : $cityCode.hashCode());
        final Object $districtCode = this.getDistrictCode();
        result = result * PRIME + ($districtCode == null ? 43 : $districtCode.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $contactsName = this.getContactsName();
        result = result * PRIME + ($contactsName == null ? 43 : $contactsName.hashCode());
        final Object $contactsCertificatesType = this.getContactsCertificatesType();
        result = result * PRIME + ($contactsCertificatesType == null ? 43 : $contactsCertificatesType.hashCode());
        final Object $contactsCertificatesNo = this.getContactsCertificatesNo();
        result = result * PRIME + ($contactsCertificatesNo == null ? 43 : $contactsCertificatesNo.hashCode());
        final Object $contactsPhone = this.getContactsPhone();
        result = result * PRIME + ($contactsPhone == null ? 43 : $contactsPhone.hashCode());
        final Object $isInsure = this.getIsInsure();
        result = result * PRIME + ($isInsure == null ? 43 : $isInsure.hashCode());
        final Object $cardNo = this.getCardNo();
        result = result * PRIME + ($cardNo == null ? 43 : $cardNo.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "Patient(userId=" + this.getUserId() + ", name=" + this.getName() + ", certificatesType=" + this.getCertificatesType() + ", certificatesNo=" + this.getCertificatesNo() + ", sex=" + this.getSex() + ", birthdate=" + this.getBirthdate() + ", phone=" + this.getPhone() + ", isMarry=" + this.getIsMarry() + ", provinceCode=" + this.getProvinceCode() + ", cityCode=" + this.getCityCode() + ", districtCode=" + this.getDistrictCode() + ", address=" + this.getAddress() + ", contactsName=" + this.getContactsName() + ", contactsCertificatesType=" + this.getContactsCertificatesType() + ", contactsCertificatesNo=" + this.getContactsCertificatesNo() + ", contactsPhone=" + this.getContactsPhone() + ", isInsure=" + this.getIsInsure() + ", cardNo=" + this.getCardNo() + ", status=" + this.getStatus() + ")";
    }
}

