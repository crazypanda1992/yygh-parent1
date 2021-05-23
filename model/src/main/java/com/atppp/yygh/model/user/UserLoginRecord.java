package com.atppp.yygh.model.user;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * UserLoginRecord
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "用户登录日志")
@TableName("user_login_record")
public class UserLoginRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户id")
	@TableField("user_id")
	private Long userId;

	@ApiModelProperty(value = "ip")
	@TableField("ip")
	private String ip;

    public UserLoginRecord() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getIp() {
        return this.ip;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserLoginRecord)) return false;
        final UserLoginRecord other = (UserLoginRecord) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserLoginRecord;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        return result;
    }

    public String toString() {
        return "UserLoginRecord(userId=" + this.getUserId() + ", ip=" + this.getIp() + ")";
    }
}

