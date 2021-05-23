package com.atppp.yygh.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="登录对象")
public class LoginVo {

    @ApiModelProperty(value = "openid")
    private String openid;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "密码")
    private String code;

    @ApiModelProperty(value = "IP")
    private String ip;

    public LoginVo() {
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getCode() {
        return this.code;
    }

    public String getIp() {
        return this.ip;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginVo)) return false;
        final LoginVo other = (LoginVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$openid = this.getOpenid();
        final Object other$openid = other.getOpenid();
        if (this$openid == null ? other$openid != null : !this$openid.equals(other$openid)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $openid = this.getOpenid();
        result = result * PRIME + ($openid == null ? 43 : $openid.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        return result;
    }

    public String toString() {
        return "LoginVo(openid=" + this.getOpenid() + ", phone=" + this.getPhone() + ", code=" + this.getCode() + ", ip=" + this.getIp() + ")";
    }
}
