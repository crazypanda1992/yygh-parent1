package com.atppp.yygh.model.hosp;

import com.atppp.yygh.model.base.BaseMongoEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * Schedule
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "Schedule")
@Document("Schedule")
public class Schedule extends BaseMongoEntity {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "医院编号")
	@Indexed //普通索引
	private String hoscode;

	@ApiModelProperty(value = "科室编号")
	@Indexed //普通索引
	private String depcode;

	@ApiModelProperty(value = "职称")
	private String title;

	@ApiModelProperty(value = "医生名称")
	private String docname;

	@ApiModelProperty(value = "擅长技能")
	private String skill;

	@ApiModelProperty(value = "排班日期")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date workDate;

	@ApiModelProperty(value = "排班时间（0：上午 1：下午）")
	private Integer workTime;

	@ApiModelProperty(value = "可预约数")
	private Integer reservedNumber;

	@ApiModelProperty(value = "剩余预约数")
	private Integer availableNumber;

	@ApiModelProperty(value = "挂号费")
	private BigDecimal amount;

	@ApiModelProperty(value = "排班状态（-1：停诊 0：停约 1：可约）")
	private Integer status;

	@ApiModelProperty(value = "排班编号（医院自己的排班主键）")
	@Indexed //普通索引
	private String hosScheduleId;

    public Schedule() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getDepcode() {
        return this.depcode;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDocname() {
        return this.docname;
    }

    public String getSkill() {
        return this.skill;
    }

    public Date getWorkDate() {
        return this.workDate;
    }

    public Integer getWorkTime() {
        return this.workTime;
    }

    public Integer getReservedNumber() {
        return this.reservedNumber;
    }

    public Integer getAvailableNumber() {
        return this.availableNumber;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getHosScheduleId() {
        return this.hosScheduleId;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public void setReservedNumber(Integer reservedNumber) {
        this.reservedNumber = reservedNumber;
    }

    public void setAvailableNumber(Integer availableNumber) {
        this.availableNumber = availableNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setHosScheduleId(String hosScheduleId) {
        this.hosScheduleId = hosScheduleId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Schedule)) return false;
        final Schedule other = (Schedule) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$depcode = this.getDepcode();
        final Object other$depcode = other.getDepcode();
        if (this$depcode == null ? other$depcode != null : !this$depcode.equals(other$depcode)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$docname = this.getDocname();
        final Object other$docname = other.getDocname();
        if (this$docname == null ? other$docname != null : !this$docname.equals(other$docname)) return false;
        final Object this$skill = this.getSkill();
        final Object other$skill = other.getSkill();
        if (this$skill == null ? other$skill != null : !this$skill.equals(other$skill)) return false;
        final Object this$workDate = this.getWorkDate();
        final Object other$workDate = other.getWorkDate();
        if (this$workDate == null ? other$workDate != null : !this$workDate.equals(other$workDate)) return false;
        final Object this$workTime = this.getWorkTime();
        final Object other$workTime = other.getWorkTime();
        if (this$workTime == null ? other$workTime != null : !this$workTime.equals(other$workTime)) return false;
        final Object this$reservedNumber = this.getReservedNumber();
        final Object other$reservedNumber = other.getReservedNumber();
        if (this$reservedNumber == null ? other$reservedNumber != null : !this$reservedNumber.equals(other$reservedNumber))
            return false;
        final Object this$availableNumber = this.getAvailableNumber();
        final Object other$availableNumber = other.getAvailableNumber();
        if (this$availableNumber == null ? other$availableNumber != null : !this$availableNumber.equals(other$availableNumber))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$hosScheduleId = this.getHosScheduleId();
        final Object other$hosScheduleId = other.getHosScheduleId();
        if (this$hosScheduleId == null ? other$hosScheduleId != null : !this$hosScheduleId.equals(other$hosScheduleId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Schedule;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $docname = this.getDocname();
        result = result * PRIME + ($docname == null ? 43 : $docname.hashCode());
        final Object $skill = this.getSkill();
        result = result * PRIME + ($skill == null ? 43 : $skill.hashCode());
        final Object $workDate = this.getWorkDate();
        result = result * PRIME + ($workDate == null ? 43 : $workDate.hashCode());
        final Object $workTime = this.getWorkTime();
        result = result * PRIME + ($workTime == null ? 43 : $workTime.hashCode());
        final Object $reservedNumber = this.getReservedNumber();
        result = result * PRIME + ($reservedNumber == null ? 43 : $reservedNumber.hashCode());
        final Object $availableNumber = this.getAvailableNumber();
        result = result * PRIME + ($availableNumber == null ? 43 : $availableNumber.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $hosScheduleId = this.getHosScheduleId();
        result = result * PRIME + ($hosScheduleId == null ? 43 : $hosScheduleId.hashCode());
        return result;
    }

    public String toString() {
        return "Schedule(hoscode=" + this.getHoscode() + ", depcode=" + this.getDepcode() + ", title=" + this.getTitle() + ", docname=" + this.getDocname() + ", skill=" + this.getSkill() + ", workDate=" + this.getWorkDate() + ", workTime=" + this.getWorkTime() + ", reservedNumber=" + this.getReservedNumber() + ", availableNumber=" + this.getAvailableNumber() + ", amount=" + this.getAmount() + ", status=" + this.getStatus() + ", hosScheduleId=" + this.getHosScheduleId() + ")";
    }
}

