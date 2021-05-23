package com.atppp.yygh.vo.user;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="会员认证对象")
public class UserAuthVo {

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

    public UserAuthVo() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserAuthVo)) return false;
        final UserAuthVo other = (UserAuthVo) o;
        if (!other.canEqual((Object) this)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserAuthVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $certificatesType = this.getCertificatesType();
        result = result * PRIME + ($certificatesType == null ? 43 : $certificatesType.hashCode());
        final Object $certificatesNo = this.getCertificatesNo();
        result = result * PRIME + ($certificatesNo == null ? 43 : $certificatesNo.hashCode());
        final Object $certificatesUrl = this.getCertificatesUrl();
        result = result * PRIME + ($certificatesUrl == null ? 43 : $certificatesUrl.hashCode());
        return result;
    }

    public String toString() {
        return "UserAuthVo(name=" + this.getName() + ", certificatesType=" + this.getCertificatesType() + ", certificatesNo=" + this.getCertificatesNo() + ", certificatesUrl=" + this.getCertificatesUrl() + ")";
    }
}
