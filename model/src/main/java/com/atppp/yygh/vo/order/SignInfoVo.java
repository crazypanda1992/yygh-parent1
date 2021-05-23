package com.atppp.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * HospitalSet
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "签名信息")
public class SignInfoVo  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "api基础路径")
	private String apiUrl;

	@ApiModelProperty(value = "签名秘钥")
	private String signKey;

    public SignInfoVo() {
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getSignKey() {
        return this.signKey;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SignInfoVo)) return false;
        final SignInfoVo other = (SignInfoVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$apiUrl = this.getApiUrl();
        final Object other$apiUrl = other.getApiUrl();
        if (this$apiUrl == null ? other$apiUrl != null : !this$apiUrl.equals(other$apiUrl)) return false;
        final Object this$signKey = this.getSignKey();
        final Object other$signKey = other.getSignKey();
        if (this$signKey == null ? other$signKey != null : !this$signKey.equals(other$signKey)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SignInfoVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $apiUrl = this.getApiUrl();
        result = result * PRIME + ($apiUrl == null ? 43 : $apiUrl.hashCode());
        final Object $signKey = this.getSignKey();
        result = result * PRIME + ($signKey == null ? 43 : $signKey.hashCode());
        return result;
    }

    public String toString() {
        return "SignInfoVo(apiUrl=" + this.getApiUrl() + ", signKey=" + this.getSignKey() + ")";
    }
}

