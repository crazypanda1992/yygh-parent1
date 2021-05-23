package com.atppp.yygh.vo.hosp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * RegisterRule
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "可预约排班规则数据")
public class BookingScheduleRuleVo {
	
	@ApiModelProperty(value = "可预约日期")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date workDate;

	@ApiModelProperty(value = "可预约日期")
	@JsonFormat(pattern = "MM月dd日")
	private Date workDateMd; //方便页面使用

	@ApiModelProperty(value = "周几")
	private String dayOfWeek;

	@ApiModelProperty(value = "就诊医生人数")
	private Integer docCount;

	@ApiModelProperty(value = "科室可预约数")
	private Integer reservedNumber;

	@ApiModelProperty(value = "科室剩余预约数")
	private Integer availableNumber;

	@ApiModelProperty(value = "状态 0：正常 1：即将放号 -1：当天已停止挂号")
	private Integer status;

    public BookingScheduleRuleVo() {
    }

    public Date getWorkDate() {
        return this.workDate;
    }

    public Date getWorkDateMd() {
        return this.workDateMd;
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public Integer getDocCount() {
        return this.docCount;
    }

    public Integer getReservedNumber() {
        return this.reservedNumber;
    }

    public Integer getAvailableNumber() {
        return this.availableNumber;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public void setWorkDateMd(Date workDateMd) {
        this.workDateMd = workDateMd;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public void setReservedNumber(Integer reservedNumber) {
        this.reservedNumber = reservedNumber;
    }

    public void setAvailableNumber(Integer availableNumber) {
        this.availableNumber = availableNumber;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BookingScheduleRuleVo)) return false;
        final BookingScheduleRuleVo other = (BookingScheduleRuleVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$workDate = this.getWorkDate();
        final Object other$workDate = other.getWorkDate();
        if (this$workDate == null ? other$workDate != null : !this$workDate.equals(other$workDate)) return false;
        final Object this$workDateMd = this.getWorkDateMd();
        final Object other$workDateMd = other.getWorkDateMd();
        if (this$workDateMd == null ? other$workDateMd != null : !this$workDateMd.equals(other$workDateMd))
            return false;
        final Object this$dayOfWeek = this.getDayOfWeek();
        final Object other$dayOfWeek = other.getDayOfWeek();
        if (this$dayOfWeek == null ? other$dayOfWeek != null : !this$dayOfWeek.equals(other$dayOfWeek)) return false;
        final Object this$docCount = this.getDocCount();
        final Object other$docCount = other.getDocCount();
        if (this$docCount == null ? other$docCount != null : !this$docCount.equals(other$docCount)) return false;
        final Object this$reservedNumber = this.getReservedNumber();
        final Object other$reservedNumber = other.getReservedNumber();
        if (this$reservedNumber == null ? other$reservedNumber != null : !this$reservedNumber.equals(other$reservedNumber))
            return false;
        final Object this$availableNumber = this.getAvailableNumber();
        final Object other$availableNumber = other.getAvailableNumber();
        if (this$availableNumber == null ? other$availableNumber != null : !this$availableNumber.equals(other$availableNumber))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BookingScheduleRuleVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $workDate = this.getWorkDate();
        result = result * PRIME + ($workDate == null ? 43 : $workDate.hashCode());
        final Object $workDateMd = this.getWorkDateMd();
        result = result * PRIME + ($workDateMd == null ? 43 : $workDateMd.hashCode());
        final Object $dayOfWeek = this.getDayOfWeek();
        result = result * PRIME + ($dayOfWeek == null ? 43 : $dayOfWeek.hashCode());
        final Object $docCount = this.getDocCount();
        result = result * PRIME + ($docCount == null ? 43 : $docCount.hashCode());
        final Object $reservedNumber = this.getReservedNumber();
        result = result * PRIME + ($reservedNumber == null ? 43 : $reservedNumber.hashCode());
        final Object $availableNumber = this.getAvailableNumber();
        result = result * PRIME + ($availableNumber == null ? 43 : $availableNumber.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "BookingScheduleRuleVo(workDate=" + this.getWorkDate() + ", workDateMd=" + this.getWorkDateMd() + ", dayOfWeek=" + this.getDayOfWeek() + ", docCount=" + this.getDocCount() + ", reservedNumber=" + this.getReservedNumber() + ", availableNumber=" + this.getAvailableNumber() + ", status=" + this.getStatus() + ")";
    }
}

