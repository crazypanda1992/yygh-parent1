package com.atppp.yygh.model.acl;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "权限")
@TableName("acl_permission")
public class Permission extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "所属上级")
	@TableField("pid")
	private Long pid;

	@ApiModelProperty(value = "名称")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "类型(1:菜单,2:按钮)")
	@TableField("type")
	private Integer type;

	@ApiModelProperty(value = "权限值")
	@TableField("permission_value")
	private String permissionValue;

	@ApiModelProperty(value = "路径")
	@TableField("path")
	private String path;

	@ApiModelProperty(value = "component")
	@TableField("component")
	private String component;

	@ApiModelProperty(value = "图标")
	@TableField("icon")
	private String icon;

	@ApiModelProperty(value = "状态(0:禁止,1:正常)")
	@TableField("status")
	private Integer status;

	@ApiModelProperty(value = "层级")
	@TableField(exist = false)
	private Integer level;

	@ApiModelProperty(value = "下级")
	@TableField(exist = false)
	private List<Permission> children;

	@ApiModelProperty(value = "是否选中")
	@TableField(exist = false)
	private boolean isSelect;

    public Permission() {
    }

    public Long getPid() {
        return this.pid;
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public String getPermissionValue() {
        return this.permissionValue;
    }

    public String getPath() {
        return this.path;
    }

    public String getComponent() {
        return this.component;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<Permission> getChildren() {
        return this.children;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setChildren(List<Permission> children) {
        this.children = children;
    }

    public void setSelect(boolean isSelect) {
        this.isSelect = isSelect;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Permission)) return false;
        final Permission other = (Permission) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$pid = this.getPid();
        final Object other$pid = other.getPid();
        if (this$pid == null ? other$pid != null : !this$pid.equals(other$pid)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$permissionValue = this.getPermissionValue();
        final Object other$permissionValue = other.getPermissionValue();
        if (this$permissionValue == null ? other$permissionValue != null : !this$permissionValue.equals(other$permissionValue))
            return false;
        final Object this$path = this.getPath();
        final Object other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
        final Object this$component = this.getComponent();
        final Object other$component = other.getComponent();
        if (this$component == null ? other$component != null : !this$component.equals(other$component)) return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$level = this.getLevel();
        final Object other$level = other.getLevel();
        if (this$level == null ? other$level != null : !this$level.equals(other$level)) return false;
        final Object this$children = this.getChildren();
        final Object other$children = other.getChildren();
        if (this$children == null ? other$children != null : !this$children.equals(other$children)) return false;
        if (this.isSelect() != other.isSelect()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Permission;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $permissionValue = this.getPermissionValue();
        result = result * PRIME + ($permissionValue == null ? 43 : $permissionValue.hashCode());
        final Object $path = this.getPath();
        result = result * PRIME + ($path == null ? 43 : $path.hashCode());
        final Object $component = this.getComponent();
        result = result * PRIME + ($component == null ? 43 : $component.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $level = this.getLevel();
        result = result * PRIME + ($level == null ? 43 : $level.hashCode());
        final Object $children = this.getChildren();
        result = result * PRIME + ($children == null ? 43 : $children.hashCode());
        result = result * PRIME + (this.isSelect() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Permission(pid=" + this.getPid() + ", name=" + this.getName() + ", type=" + this.getType() + ", permissionValue=" + this.getPermissionValue() + ", path=" + this.getPath() + ", component=" + this.getComponent() + ", icon=" + this.getIcon() + ", status=" + this.getStatus() + ", level=" + this.getLevel() + ", children=" + this.getChildren() + ", isSelect=" + this.isSelect() + ")";
    }
}

