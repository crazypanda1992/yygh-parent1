package com.atppp.yygh.vo.msm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel(description = "短信实体")
public class MsmVo {

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "短信模板code")
    private String templateCode;

    @ApiModelProperty(value = "短信模板参数")
    private Map<String,Object> param;

    public MsmVo() {
    }

    public String getPhone() {
        return this.phone;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public Map<String, Object> getParam() {
        return this.param;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MsmVo)) return false;
        final MsmVo other = (MsmVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$templateCode = this.getTemplateCode();
        final Object other$templateCode = other.getTemplateCode();
        if (this$templateCode == null ? other$templateCode != null : !this$templateCode.equals(other$templateCode))
            return false;
        final Object this$param = this.getParam();
        final Object other$param = other.getParam();
        if (this$param == null ? other$param != null : !this$param.equals(other$param)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MsmVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $templateCode = this.getTemplateCode();
        result = result * PRIME + ($templateCode == null ? 43 : $templateCode.hashCode());
        final Object $param = this.getParam();
        result = result * PRIME + ($param == null ? 43 : $param.hashCode());
        return result;
    }

    public String toString() {
        return "MsmVo(phone=" + this.getPhone() + ", templateCode=" + this.getTemplateCode() + ", param=" + this.getParam() + ")";
    }
}
