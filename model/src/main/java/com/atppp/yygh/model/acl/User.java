package com.atppp.yygh.model.acl;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "用户")
@TableName("acl_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户名")
	@TableField("username")
	private String username;

	@ApiModelProperty(value = "密码")
	@TableField("password")
	private String password;

	@ApiModelProperty(value = "昵称")
	@TableField("nick_name")
	private String nickName;

	@ApiModelProperty(value = "用户头像")
	@TableField("salt")
	private String salt;

	@ApiModelProperty(value = "用户签名")
	@TableField("token")
	private String token;

	public User() {
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getNickName() {
		return this.nickName;
	}

	public String getSalt() {
		return this.salt;
	}

	public String getToken() {
		return this.token;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof User)) return false;
		final User other = (User) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		final Object this$password = this.getPassword();
		final Object other$password = other.getPassword();
		if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
		final Object this$nickName = this.getNickName();
		final Object other$nickName = other.getNickName();
		if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
		final Object this$salt = this.getSalt();
		final Object other$salt = other.getSalt();
		if (this$salt == null ? other$salt != null : !this$salt.equals(other$salt)) return false;
		final Object this$token = this.getToken();
		final Object other$token = other.getToken();
		if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof User;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		final Object $password = this.getPassword();
		result = result * PRIME + ($password == null ? 43 : $password.hashCode());
		final Object $nickName = this.getNickName();
		result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
		final Object $salt = this.getSalt();
		result = result * PRIME + ($salt == null ? 43 : $salt.hashCode());
		final Object $token = this.getToken();
		result = result * PRIME + ($token == null ? 43 : $token.hashCode());
		return result;
	}

	public String toString() {
		return "User(username=" + this.getUsername() + ", password=" + this.getPassword() + ", nickName=" + this.getNickName() + ", salt=" + this.getSalt() + ", token=" + this.getToken() + ")";
	}
}



