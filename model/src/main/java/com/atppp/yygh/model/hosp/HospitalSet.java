package com.atppp.yygh.model.hosp;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * HospitalSet
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "医院设置")
@TableName("hospital_set")
public class HospitalSet extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "医院名称")
	@TableField("hosname")
	private String hosname;

	@ApiModelProperty(value = "医院编号")
	@TableField("hoscode")
	private String hoscode;

	@ApiModelProperty(value = "api基础路径")
	@TableField("api_url")
	private String apiUrl;

	@ApiModelProperty(value = "签名秘钥")
	@TableField("sign_key")
	private String signKey;

	@ApiModelProperty(value = "联系人姓名")
	@TableField("contacts_name")
	private String contactsName;

	@ApiModelProperty(value = "联系人手机")
	@TableField("contacts_phone")
	private String contactsPhone;

	@ApiModelProperty(value = "状态")
	@TableField("status")
	private Integer status;

    public HospitalSet() {
    }

    public String getHosname() {
        return this.hosname;
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getSignKey() {
        return this.signKey;
    }

    public String getContactsName() {
        return this.contactsName;
    }

    public String getContactsPhone() {
        return this.contactsPhone;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HospitalSet)) return false;
        final HospitalSet other = (HospitalSet) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hosname = this.getHosname();
        final Object other$hosname = other.getHosname();
        if (this$hosname == null ? other$hosname != null : !this$hosname.equals(other$hosname)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$apiUrl = this.getApiUrl();
        final Object other$apiUrl = other.getApiUrl();
        if (this$apiUrl == null ? other$apiUrl != null : !this$apiUrl.equals(other$apiUrl)) return false;
        final Object this$signKey = this.getSignKey();
        final Object other$signKey = other.getSignKey();
        if (this$signKey == null ? other$signKey != null : !this$signKey.equals(other$signKey)) return false;
        final Object this$contactsName = this.getContactsName();
        final Object other$contactsName = other.getContactsName();
        if (this$contactsName == null ? other$contactsName != null : !this$contactsName.equals(other$contactsName))
            return false;
        final Object this$contactsPhone = this.getContactsPhone();
        final Object other$contactsPhone = other.getContactsPhone();
        if (this$contactsPhone == null ? other$contactsPhone != null : !this$contactsPhone.equals(other$contactsPhone))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HospitalSet;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hosname = this.getHosname();
        result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $apiUrl = this.getApiUrl();
        result = result * PRIME + ($apiUrl == null ? 43 : $apiUrl.hashCode());
        final Object $signKey = this.getSignKey();
        result = result * PRIME + ($signKey == null ? 43 : $signKey.hashCode());
        final Object $contactsName = this.getContactsName();
        result = result * PRIME + ($contactsName == null ? 43 : $contactsName.hashCode());
        final Object $contactsPhone = this.getContactsPhone();
        result = result * PRIME + ($contactsPhone == null ? 43 : $contactsPhone.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "HospitalSet(hosname=" + this.getHosname() + ", hoscode=" + this.getHoscode() + ", apiUrl=" + this.getApiUrl() + ", signKey=" + this.getSignKey() + ", contactsName=" + this.getContactsName() + ", contactsPhone=" + this.getContactsPhone() + ", status=" + this.getStatus() + ")";
    }
}

