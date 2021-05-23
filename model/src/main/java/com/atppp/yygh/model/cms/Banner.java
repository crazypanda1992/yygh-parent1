package com.atppp.yygh.model.cms;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 首页Banner实体
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@ApiModel(description = "首页Banner实体")
@TableName("banner")
public class Banner extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "标题")
	@TableField("title")
	private String title;

	@ApiModelProperty(value = "图片地址")
	@TableField("image_url")
	private String imageUrl;

	@ApiModelProperty(value = "链接地址")
	@TableField("link_url")
	private String linkUrl;

	@ApiModelProperty(value = "排序")
	@TableField("sort")
	private Integer sort;

    public Banner() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Banner)) return false;
        final Banner other = (Banner) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$linkUrl = this.getLinkUrl();
        final Object other$linkUrl = other.getLinkUrl();
        if (this$linkUrl == null ? other$linkUrl != null : !this$linkUrl.equals(other$linkUrl)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Banner;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $linkUrl = this.getLinkUrl();
        result = result * PRIME + ($linkUrl == null ? 43 : $linkUrl.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }

    public String toString() {
        return "Banner(title=" + this.getTitle() + ", imageUrl=" + this.getImageUrl() + ", linkUrl=" + this.getLinkUrl() + ", sort=" + this.getSort() + ")";
    }
}

