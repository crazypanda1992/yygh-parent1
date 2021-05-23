package com.atppp.yygh.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="会员搜索对象")
public class UserInfoQueryVo {

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "认证状态")
    private Integer authStatus;

    @ApiModelProperty(value = "创建时间")
    private String createTimeBegin;

    @ApiModelProperty(value = "创建时间")
    private String createTimeEnd;

    public UserInfoQueryVo() {
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserInfoQueryVo)) return false;
        final UserInfoQueryVo other = (UserInfoQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$authStatus = this.getAuthStatus();
        final Object other$authStatus = other.getAuthStatus();
        if (this$authStatus == null ? other$authStatus != null : !this$authStatus.equals(other$authStatus))
            return false;
        final Object this$createTimeBegin = this.getCreateTimeBegin();
        final Object other$createTimeBegin = other.getCreateTimeBegin();
        if (this$createTimeBegin == null ? other$createTimeBegin != null : !this$createTimeBegin.equals(other$createTimeBegin))
            return false;
        final Object this$createTimeEnd = this.getCreateTimeEnd();
        final Object other$createTimeEnd = other.getCreateTimeEnd();
        if (this$createTimeEnd == null ? other$createTimeEnd != null : !this$createTimeEnd.equals(other$createTimeEnd))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserInfoQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $authStatus = this.getAuthStatus();
        result = result * PRIME + ($authStatus == null ? 43 : $authStatus.hashCode());
        final Object $createTimeBegin = this.getCreateTimeBegin();
        result = result * PRIME + ($createTimeBegin == null ? 43 : $createTimeBegin.hashCode());
        final Object $createTimeEnd = this.getCreateTimeEnd();
        result = result * PRIME + ($createTimeEnd == null ? 43 : $createTimeEnd.hashCode());
        return result;
    }

    public String toString() {
        return "UserInfoQueryVo(keyword=" + this.getKeyword() + ", status=" + this.getStatus() + ", authStatus=" + this.getAuthStatus() + ", createTimeBegin=" + this.getCreateTimeBegin() + ", createTimeEnd=" + this.getCreateTimeEnd() + ")";
    }
}
