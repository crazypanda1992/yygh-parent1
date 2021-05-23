package com.atppp.yygh.model.hosp;

import com.atppp.yygh.model.base.BaseMongoEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * Department
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "Department")
@Document("Department")
public class Department extends BaseMongoEntity {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "医院编号")
	@Indexed //普通索引
	private String hoscode;

	@ApiModelProperty(value = "科室编号")
	@Indexed(unique = true) //唯一索引
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	private String depname;

	@ApiModelProperty(value = "科室描述")
	private String intro;

	@ApiModelProperty(value = "大科室编号")
	private String bigcode;

	@ApiModelProperty(value = "大科室名称")
	private String bigname;

    public Department() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getDepcode() {
        return this.depcode;
    }

    public String getDepname() {
        return this.depname;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getBigcode() {
        return this.bigcode;
    }

    public String getBigname() {
        return this.bigname;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setBigcode(String bigcode) {
        this.bigcode = bigcode;
    }

    public void setBigname(String bigname) {
        this.bigname = bigname;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Department)) return false;
        final Department other = (Department) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$depcode = this.getDepcode();
        final Object other$depcode = other.getDepcode();
        if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
        final Object this$depname = this.getDepname();
        final Object other$depname = other.getDepname();
        if (this$depname == null ? other$depname != null : !this$depname.equals(other$depname)) return false;
        final Object this$intro = this.getIntro();
        final Object other$intro = other.getIntro();
        if (this$intro == null ? other$intro != null : !this$intro.equals(other$intro)) return false;
        final Object this$bigcode = this.getBigcode();
        final Object other$bigcode = other.getBigcode();
        if (this$bigcode == null ? other$bigcode != null : !this$bigcode.equals(other$bigcode)) return false;
        final Object this$bigname = this.getBigname();
        final Object other$bigname = other.getBigname();
        if (this$bigname == null ? other$bigname != null : !this$bigname.equals(other$bigname)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Department;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $depname = this.getDepname();
        result = result * PRIME + ($depname == null ? 43 : $depname.hashCode());
        final Object $intro = this.getIntro();
        result = result * PRIME + ($intro == null ? 43 : $intro.hashCode());
        final Object $bigcode = this.getBigcode();
        result = result * PRIME + ($bigcode == null ? 43 : $bigcode.hashCode());
        final Object $bigname = this.getBigname();
        result = result * PRIME + ($bigname == null ? 43 : $bigname.hashCode());
        return result;
    }

    public String toString() {
        return "Department(hoscode=" + this.getHoscode() + ", depcode=" + this.getDepcode() + ", depname=" + this.getDepname() + ", intro=" + this.getIntro() + ", bigcode=" + this.getBigcode() + ", bigname=" + this.getBigname() + ")";
    }
}

