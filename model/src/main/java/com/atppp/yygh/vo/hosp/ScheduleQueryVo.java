package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Schedule")
public class ScheduleQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hoscode;

	@ApiModelProperty(value = "科室编号")
	private String depcode;

	@ApiModelProperty(value = "医生编号")
	private String doccode;

	@ApiModelProperty(value = "安排日期")
	private Date workDate;

	@ApiModelProperty(value = "安排时间（0：上午 1：下午）")
	private Integer workTime;

    public ScheduleQueryVo() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getDepcode() {
        return this.depcode;
    }

    public String getDoccode() {
        return this.doccode;
    }

    public Date getWorkDate() {
        return this.workDate;
    }

    public Integer getWorkTime() {
        return this.workTime;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ScheduleQueryVo)) return false;
        final ScheduleQueryVo other = (ScheduleQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$depcode = this.getDepcode();
        final Object other$depcode = other.getDepcode();
        if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
        final Object this$doccode = this.getDoccode();
        final Object other$doccode = other.getDoccode();
        if (this$doccode == null ? other$doccode != null : !this$doccode.equals(other$doccode)) return false;
        final Object this$workDate = this.getWorkDate();
        final Object other$workDate = other.getWorkDate();
        if (this$workDate == null ? other$workDate != null : !this$workDate.equals(other$workDate)) return false;
        final Object this$workTime = this.getWorkTime();
        final Object other$workTime = other.getWorkTime();
        if (this$workTime == null ? other$workTime != null : !this$workTime.equals(other$workTime)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ScheduleQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $doccode = this.getDoccode();
        result = result * PRIME + ($doccode == null ? 43 : $doccode.hashCode());
        final Object $workDate = this.getWorkDate();
        result = result * PRIME + ($workDate == null ? 43 : $workDate.hashCode());
        final Object $workTime = this.getWorkTime();
        result = result * PRIME + ($workTime == null ? 43 : $workTime.hashCode());
        return result;
    }

    public String toString() {
        return "ScheduleQueryVo(hoscode=" + this.getHoscode() + ", depcode=" + this.getDepcode() + ", doccode=" + this.getDoccode() + ", workDate=" + this.getWorkDate() + ", workTime=" + this.getWorkTime() + ")";
    }
}

