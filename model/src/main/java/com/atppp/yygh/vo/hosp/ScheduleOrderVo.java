package com.atppp.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(description = "Schedule")
public class ScheduleOrderVo {

	@ApiModelProperty(value = "医院编号")
	private String hoscode;

	@ApiModelProperty(value = "医院名称")
	private String hosname;

	@ApiModelProperty(value = "科室编号")
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	private String depname;

	@ApiModelProperty(value = "排班编号（医院自己的排班主键）")
	private String hosScheduleId;

	@ApiModelProperty(value = "医生职称")
	private String title;

	@ApiModelProperty(value = "安排日期")
	private Date reserveDate;

	@ApiModelProperty(value = "剩余预约数")
	private Integer availableNumber;

	@ApiModelProperty(value = "安排时间（0：上午 1：下午）")
	private Integer reserveTime;

	@ApiModelProperty(value = "医事服务费")
	private BigDecimal amount;

	@ApiModelProperty(value = "退号时间")
	private Date quitTime;

	@ApiModelProperty(value = "挂号开始时间")
	private Date startTime;

	@ApiModelProperty(value = "挂号结束时间")
	private Date endTime;

	@ApiModelProperty(value = "当天停止挂号时间")
	private Date stopTime;

	public ScheduleOrderVo() {
	}

	public String getHoscode() {
		return this.hoscode;
	}

	public String getHosname() {
		return this.hosname;
	}

	public String getDepcode() {
		return this.depcode;
	}

	public String getDepname() {
		return this.depname;
	}

	public String getHosScheduleId() {
		return this.hosScheduleId;
	}

	public String getTitle() {
		return this.title;
	}

	public Date getReserveDate() {
		return this.reserveDate;
	}

	public Integer getAvailableNumber() {
		return this.availableNumber;
	}

	public Integer getReserveTime() {
		return this.reserveTime;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public Date getQuitTime() {
		return this.quitTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public Date getStopTime() {
		return this.stopTime;
	}

	public void setHoscode(String hoscode) {
		this.hoscode = hoscode;
	}

	public void setHosname(String hosname) {
		this.hosname = hosname;
	}

	public void setDepcode(String depcode) {
		this.depcode = depcode;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public void setHosScheduleId(String hosScheduleId) {
		this.hosScheduleId = hosScheduleId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public void setAvailableNumber(Integer availableNumber) {
		this.availableNumber = availableNumber;
	}

	public void setReserveTime(Integer reserveTime) {
		this.reserveTime = reserveTime;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setQuitTime(Date quitTime) {
		this.quitTime = quitTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ScheduleOrderVo)) return false;
		final ScheduleOrderVo other = (ScheduleOrderVo) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$hoscode = this.getHoscode();
		final Object other$hoscode = other.getHoscode();
		if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
		final Object this$hosname = this.getHosname();
		final Object other$hosname = other.getHosname();
		if (this$hosname == null ? other$hosname != null : !this$hosname.equals(other$hosname)) return false;
		final Object this$depcode = this.getDepcode();
		final Object other$depcode = other.getDepcode();
		if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
		final Object this$depname = this.getDepname();
		final Object other$depname = other.getDepname();
		if (this$depname == null ? other$depname != null : !this$depname.equals(other$depname)) return false;
		final Object this$hosScheduleId = this.getHosScheduleId();
		final Object other$hosScheduleId = other.getHosScheduleId();
		if (this$hosScheduleId == null ? other$hosScheduleId != null : !this$hosScheduleId.equals(other$hosScheduleId))
			return false;
		final Object this$title = this.getTitle();
		final Object other$title = other.getTitle();
		if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
		final Object this$reserveDate = this.getReserveDate();
		final Object other$reserveDate = other.getReserveDate();
		if (this$reserveDate == null ? other$reserveDate != null : !this$reserveDate.equals(other$reserveDate))
			return false;
		final Object this$availableNumber = this.getAvailableNumber();
		final Object other$availableNumber = other.getAvailableNumber();
		if (this$availableNumber == null ? other$availableNumber != null : !this$availableNumber.equals(other$availableNumber))
			return false;
		final Object this$reserveTime = this.getReserveTime();
		final Object other$reserveTime = other.getReserveTime();
		if (this$reserveTime == null ? other$reserveTime != null : !this$reserveTime.equals(other$reserveTime))
			return false;
		final Object this$amount = this.getAmount();
		final Object other$amount = other.getAmount();
		if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
		final Object this$quitTime = this.getQuitTime();
		final Object other$quitTime = other.getQuitTime();
		if (this$quitTime == null ? other$quitTime != null : !this$quitTime.equals(other$quitTime)) return false;
		final Object this$startTime = this.getStartTime();
		final Object other$startTime = other.getStartTime();
		if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
		final Object this$endTime = this.getEndTime();
		final Object other$endTime = other.getEndTime();
		if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
		final Object this$stopTime = this.getStopTime();
		final Object other$stopTime = other.getStopTime();
		if (this$stopTime == null ? other$stopTime != null : !this$stopTime.equals(other$stopTime)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ScheduleOrderVo;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $hoscode = this.getHoscode();
		result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
		final Object $hosname = this.getHosname();
		result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
		final Object $depcode = this.getDepcode();
		result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
		final Object $depname = this.getDepname();
		result = result * PRIME + ($depname == null ? 43 : $depname.hashCode());
		final Object $hosScheduleId = this.getHosScheduleId();
		result = result * PRIME + ($hosScheduleId == null ? 43 : $hosScheduleId.hashCode());
		final Object $title = this.getTitle();
		result = result * PRIME + ($title == null ? 43 : $title.hashCode());
		final Object $reserveDate = this.getReserveDate();
		result = result * PRIME + ($reserveDate == null ? 43 : $reserveDate.hashCode());
		final Object $availableNumber = this.getAvailableNumber();
		result = result * PRIME + ($availableNumber == null ? 43 : $availableNumber.hashCode());
		final Object $reserveTime = this.getReserveTime();
		result = result * PRIME + ($reserveTime == null ? 43 : $reserveTime.hashCode());
		final Object $amount = this.getAmount();
		result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
		final Object $quitTime = this.getQuitTime();
		result = result * PRIME + ($quitTime == null ? 43 : $quitTime.hashCode());
		final Object $startTime = this.getStartTime();
		result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
		final Object $endTime = this.getEndTime();
		result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
		final Object $stopTime = this.getStopTime();
		result = result * PRIME + ($stopTime == null ? 43 : $stopTime.hashCode());
		return result;
	}

	public String toString() {
		return "ScheduleOrderVo(hoscode=" + this.getHoscode() + ", hosname=" + this.getHosname() + ", depcode=" + this.getDepcode() + ", depname=" + this.getDepname() + ", hosScheduleId=" + this.getHosScheduleId() + ", title=" + this.getTitle() + ", reserveDate=" + this.getReserveDate() + ", availableNumber=" + this.getAvailableNumber() + ", reserveTime=" + this.getReserveTime() + ", amount=" + this.getAmount() + ", quitTime=" + this.getQuitTime() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", stopTime=" + this.getStopTime() + ")";
	}
}

