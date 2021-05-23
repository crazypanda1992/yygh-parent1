package com.atppp.yygh.vo.cmn;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * <p>
 * Dict
 * </p>
 *
 * @author qy
 */
public class DictEeVo {

	@ExcelProperty(value = "id" ,index = 0)
	private Long id;

	@ExcelProperty(value = "上级id" ,index = 1)
	private Long parentId;

	@ExcelProperty(value = "名称" ,index = 2)
	private String name;

	@ExcelProperty(value = "值" ,index = 3)
	private String value;

	@ExcelProperty(value = "编码" ,index = 4)
	private String dictCode;

	public DictEeVo() {
	}

	public Long getId() {
		return this.id;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public String getDictCode() {
		return this.dictCode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof DictEeVo)) return false;
		final DictEeVo other = (DictEeVo) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$parentId = this.getParentId();
		final Object other$parentId = other.getParentId();
		if (this$parentId == null ? other$parentId != null : !this$parentId.equals(other$parentId)) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$value = this.getValue();
		final Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
		final Object this$dictCode = this.getDictCode();
		final Object other$dictCode = other.getDictCode();
		if (this$dictCode == null ? other$dictCode != null : !this$dictCode.equals(other$dictCode)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof DictEeVo;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $parentId = this.getParentId();
		result = result * PRIME + ($parentId == null ? 43 : $parentId.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		final Object $dictCode = this.getDictCode();
		result = result * PRIME + ($dictCode == null ? 43 : $dictCode.hashCode());
		return result;
	}

	public String toString() {
		return "DictEeVo(id=" + this.getId() + ", parentId=" + this.getParentId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", dictCode=" + this.getDictCode() + ")";
	}
}

