package com.atppp.yygh.model.order;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * Order
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "Order")
@TableName("order_info")
public class OrderInfo extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "userId")
	@TableField("user_id")
	private Long userId;

	@ApiModelProperty(value = "订单交易号")
	@TableField("out_trade_no")
	private String outTradeNo;

	@ApiModelProperty(value = "医院编号")
	@TableField("hoscode")
	private String hoscode;

	@ApiModelProperty(value = "医院名称")
	@TableField("hosname")
	private String hosname;

	@ApiModelProperty(value = "科室编号")
	@TableField("depcode")
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	@TableField("depname")
	private String depname;

	@ApiModelProperty(value = "排班id")
	@TableField("schedule_id")
	private String scheduleId;

	@ApiModelProperty(value = "医生职称")
	@TableField("title")
	private String title;

	@ApiModelProperty(value = "安排日期")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@TableField("reserve_date")
	private Date reserveDate;

	@ApiModelProperty(value = "安排时间（0：上午 1：下午）")
	@TableField("reserve_time")
	private Integer reserveTime;

	@ApiModelProperty(value = "就诊人id")
	@TableField("patient_id")
	private Long patientId;

	@ApiModelProperty(value = "就诊人名称")
	@TableField("patient_name")
	private String patientName;

	@ApiModelProperty(value = "就诊人手机")
	@TableField("patient_phone")
	private String patientPhone;

	@ApiModelProperty(value = "预约记录唯一标识（医院预约记录主键）")
	@TableField("hos_record_id")
	private String hosRecordId;

	@ApiModelProperty(value = "预约号序")
	@TableField("number")
	private Integer number;

	@ApiModelProperty(value = "建议取号时间")
	@TableField("fetch_time")
	private String fetchTime;

	@ApiModelProperty(value = "取号地点")
	@TableField("fetch_address")
	private String fetchAddress;

	@ApiModelProperty(value = "医事服务费")
	@TableField("amount")
	private BigDecimal amount;

	@ApiModelProperty(value = "退号时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	@TableField("quit_time")
	private Date quitTime;

	@ApiModelProperty(value = "订单状态")
	@TableField("order_status")
	private Integer orderStatus;

    public OrderInfo() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
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

    public String getScheduleId() {
        return this.scheduleId;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getReserveDate() {
        return this.reserveDate;
    }

    public Integer getReserveTime() {
        return this.reserveTime;
    }

    public Long getPatientId() {
        return this.patientId;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public String getPatientPhone() {
        return this.patientPhone;
    }

    public String getHosRecordId() {
        return this.hosRecordId;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getFetchTime() {
        return this.fetchTime;
    }

    public String getFetchAddress() {
        return this.fetchAddress;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public Date getQuitTime() {
        return this.quitTime;
    }

    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public void setReserveTime(Integer reserveTime) {
        this.reserveTime = reserveTime;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public void setHosRecordId(String hosRecordId) {
        this.hosRecordId = hosRecordId;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public void setFetchAddress(String fetchAddress) {
        this.fetchAddress = fetchAddress;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderInfo)) return false;
        final OrderInfo other = (OrderInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
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
        final Object this$scheduleId = this.getScheduleId();
        final Object other$scheduleId = other.getScheduleId();
        if (this$scheduleId == null ? other$scheduleId != null : !this$scheduleId.equals(other$scheduleId))
            return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$reserveDate = this.getReserveDate();
        final Object other$reserveDate = other.getReserveDate();
        if (this$reserveDate == null ? other$reserveDate != null : !this$reserveDate.equals(other$reserveDate))
            return false;
        final Object this$reserveTime = this.getReserveTime();
        final Object other$reserveTime = other.getReserveTime();
        if (this$reserveTime == null ? other$reserveTime != null : !this$reserveTime.equals(other$reserveTime))
            return false;
        final Object this$patientId = this.getPatientId();
        final Object other$patientId = other.getPatientId();
        if (this$patientId == null ? other$patientId != null : !this$patientId.equals(other$patientId)) return false;
        final Object this$patientName = this.getPatientName();
        final Object other$patientName = other.getPatientName();
        if (this$patientName == null ? other$patientName != null : !this$patientName.equals(other$patientName))
            return false;
        final Object this$patientPhone = this.getPatientPhone();
        final Object other$patientPhone = other.getPatientPhone();
        if (this$patientPhone == null ? other$patientPhone != null : !this$patientPhone.equals(other$patientPhone))
            return false;
        final Object this$hosRecordId = this.getHosRecordId();
        final Object other$hosRecordId = other.getHosRecordId();
        if (this$hosRecordId == null ? other$hosRecordId != null : !this$hosRecordId.equals(other$hosRecordId))
            return false;
        final Object this$number = this.getNumber();
        final Object other$number = other.getNumber();
        if (this$number == null ? other$number != null : !this$number.equals(other$number)) return false;
        final Object this$fetchTime = this.getFetchTime();
        final Object other$fetchTime = other.getFetchTime();
        if (this$fetchTime == null ? other$fetchTime != null : !this$fetchTime.equals(other$fetchTime)) return false;
        final Object this$fetchAddress = this.getFetchAddress();
        final Object other$fetchAddress = other.getFetchAddress();
        if (this$fetchAddress == null ? other$fetchAddress != null : !this$fetchAddress.equals(other$fetchAddress))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$quitTime = this.getQuitTime();
        final Object other$quitTime = other.getQuitTime();
        if (this$quitTime == null ? other$quitTime != null : !this$quitTime.equals(other$quitTime)) return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $hosname = this.getHosname();
        result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
        final Object $depcode = this.getDepcode();
        result = result * PRIME + ($depcode == null ? 43 : $depcode.hashCode());
        final Object $depname = this.getDepname();
        result = result * PRIME + ($depname == null ? 43 : $depname.hashCode());
        final Object $scheduleId = this.getScheduleId();
        result = result * PRIME + ($scheduleId == null ? 43 : $scheduleId.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $reserveDate = this.getReserveDate();
        result = result * PRIME + ($reserveDate == null ? 43 : $reserveDate.hashCode());
        final Object $reserveTime = this.getReserveTime();
        result = result * PRIME + ($reserveTime == null ? 43 : $reserveTime.hashCode());
        final Object $patientId = this.getPatientId();
        result = result * PRIME + ($patientId == null ? 43 : $patientId.hashCode());
        final Object $patientName = this.getPatientName();
        result = result * PRIME + ($patientName == null ? 43 : $patientName.hashCode());
        final Object $patientPhone = this.getPatientPhone();
        result = result * PRIME + ($patientPhone == null ? 43 : $patientPhone.hashCode());
        final Object $hosRecordId = this.getHosRecordId();
        result = result * PRIME + ($hosRecordId == null ? 43 : $hosRecordId.hashCode());
        final Object $number = this.getNumber();
        result = result * PRIME + ($number == null ? 43 : $number.hashCode());
        final Object $fetchTime = this.getFetchTime();
        result = result * PRIME + ($fetchTime == null ? 43 : $fetchTime.hashCode());
        final Object $fetchAddress = this.getFetchAddress();
        result = result * PRIME + ($fetchAddress == null ? 43 : $fetchAddress.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $quitTime = this.getQuitTime();
        result = result * PRIME + ($quitTime == null ? 43 : $quitTime.hashCode());
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        return result;
    }

    public String toString() {
        return "OrderInfo(userId=" + this.getUserId() + ", outTradeNo=" + this.getOutTradeNo() + ", hoscode=" + this.getHoscode() + ", hosname=" + this.getHosname() + ", depcode=" + this.getDepcode() + ", depname=" + this.getDepname() + ", scheduleId=" + this.getScheduleId() + ", title=" + this.getTitle() + ", reserveDate=" + this.getReserveDate() + ", reserveTime=" + this.getReserveTime() + ", patientId=" + this.getPatientId() + ", patientName=" + this.getPatientName() + ", patientPhone=" + this.getPatientPhone() + ", hosRecordId=" + this.getHosRecordId() + ", number=" + this.getNumber() + ", fetchTime=" + this.getFetchTime() + ", fetchAddress=" + this.getFetchAddress() + ", amount=" + this.getAmount() + ", quitTime=" + this.getQuitTime() + ", orderStatus=" + this.getOrderStatus() + ")";
    }
}

