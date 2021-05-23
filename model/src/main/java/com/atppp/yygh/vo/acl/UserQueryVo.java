package com.atppp.yygh.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 用户查询实体
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "用户查询实体")
public class UserQueryVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户名")
	private String username;

	@ApiModelProperty(value = "昵称")
	private String nickName;

    public UserQueryVo() {
    }

    public String getUsername() {
        return this.username;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserQueryVo)) return false;
        final UserQueryVo other = (UserQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        return result;
    }

    public String toString() {
        return "UserQueryVo(username=" + this.getUsername() + ", nickName=" + this.getNickName() + ")";
    }
}

