package com.atppp.yygh.model.user;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * UserInfo
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "UserInfo")
@TableName("user_info")
public class UserInfo extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "微信openid")
	@TableField("openid")
	private String openid;

	@ApiModelProperty(value = "昵称")
	@TableField("nick_name")
	private String nickName;

	@ApiModelProperty(value = "手机号")
	@TableField("phone")
	private String phone;

	@ApiModelProperty(value = "用户姓名")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "证件类型")
	@TableField("certificates_type")
	private String certificatesType;

	@ApiModelProperty(value = "证件编号")
	@TableField("certificates_no")
	private String certificatesNo;

	@ApiModelProperty(value = "证件路径")
	@TableField("certificates_url")
	private String certificatesUrl;

	@ApiModelProperty(value = "认证状态（0：未认证 1：认证中 2：认证成功 -1：认证失败）")
	@TableField("auth_status")
	private Integer authStatus;

	@ApiModelProperty(value = "状态（0：锁定 1：正常）")
	@TableField("status")
	private Integer status;

    public UserInfo() {
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPhone() {
        return this.phone;
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

    public String getCertificatesUrl() {
        return this.certificatesUrl;
    }

    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public void setCertificatesUrl(String certificatesUrl) {
        this.certificatesUrl = certificatesUrl;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserInfo)) return false;
        final UserInfo other = (UserInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$openid = this.getOpenid();
        final Object other$openid = other.getOpenid();
        if (this$openid == null ? other$openid != null : !this$openid.equals(other$openid)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
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
        final Object this$certificatesUrl = this.getCertificatesUrl();
        final Object other$certificatesUrl = other.getCertificatesUrl();
        if (this$certificatesUrl == null ? other$certificatesUrl != null : !this$certificatesUrl.equals(other$certificatesUrl))
            return false;
        final Object this$authStatus = this.getAuthStatus();
        final Object other$authStatus = other.getAuthStatus();
        if (this$authStatus == null ? other$authStatus != null : !this$authStatus.equals(other$authStatus))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $openid = this.getOpenid();
        result = result * PRIME + ($openid == null ? 43 : $openid.hashCode());
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $certificatesType = this.getCertificatesType();
        result = result * PRIME + ($certificatesType == null ? 43 : $certificatesType.hashCode());
        final Object $certificatesNo = this.getCertificatesNo();
        result = result * PRIME + ($certificatesNo == null ? 43 : $certificatesNo.hashCode());
        final Object $certificatesUrl = this.getCertificatesUrl();
        result = result * PRIME + ($certificatesUrl == null ? 43 : $certificatesUrl.hashCode());
        final Object $authStatus = this.getAuthStatus();
        result = result * PRIME + ($authStatus == null ? 43 : $authStatus.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "UserInfo(openid=" + this.getOpenid() + ", nickName=" + this.getNickName() + ", phone=" + this.getPhone() + ", name=" + this.getName() + ", certificatesType=" + this.getCertificatesType() + ", certificatesNo=" + this.getCertificatesNo() + ", certificatesUrl=" + this.getCertificatesUrl() + ", authStatus=" + this.getAuthStatus() + ", status=" + this.getStatus() + ")";
    }
}

