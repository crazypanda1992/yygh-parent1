package com.atppp.yygh.vo.order;

import com.atppp.yygh.vo.msm.MsmVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "OrderMqVo")
public class OrderMqVo {

	@ApiModelProperty(value = "可预约数")
	private Integer reservedNumber;

	@ApiModelProperty(value = "剩余预约数")
	private Integer availableNumber;

	@ApiModelProperty(value = "排班id")
	private String scheduleId;

	@ApiModelProperty(value = "短信实体")
	private MsmVo msmVo;

    public OrderMqVo() {
    }

    public Integer getReservedNumber() {
        return this.reservedNumber;
    }

    public Integer getAvailableNumber() {
        return this.availableNumber;
    }

    public String getScheduleId() {
        return this.scheduleId;
    }

    public MsmVo getMsmVo() {
        return this.msmVo;
    }

    public void setReservedNumber(Integer reservedNumber) {
        this.reservedNumber = reservedNumber;
    }

    public void setAvailableNumber(Integer availableNumber) {
        this.availableNumber = availableNumber;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setMsmVo(MsmVo msmVo) {
        this.msmVo = msmVo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderMqVo)) return false;
        final OrderMqVo other = (OrderMqVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$reservedNumber = this.getReservedNumber();
        final Object other$reservedNumber = other.getReservedNumber();
        if (this$reservedNumber == null ? other$reservedNumber != null : !this$reservedNumber.equals(other$reservedNumber))
            return false;
        final Object this$availableNumber = this.getAvailableNumber();
        final Object other$availableNumber = other.getAvailableNumber();
        if (this$availableNumber == null ? other$availableNumber != null : !this$availableNumber.equals(other$availableNumber))
            return false;
        final Object this$scheduleId = this.getScheduleId();
        final Object other$scheduleId = other.getScheduleId();
        if (this$scheduleId == null ? other$scheduleId != null : !this$scheduleId.equals(other$scheduleId))
            return false;
        final Object this$msmVo = this.getMsmVo();
        final Object other$msmVo = other.getMsmVo();
        if (this$msmVo == null ? other$msmVo != null : !this$msmVo.equals(other$msmVo)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderMqVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $reservedNumber = this.getReservedNumber();
        result = result * PRIME + ($reservedNumber == null ? 43 : $reservedNumber.hashCode());
        final Object $availableNumber = this.getAvailableNumber();
        result = result * PRIME + ($availableNumber == null ? 43 : $availableNumber.hashCode());
        final Object $scheduleId = this.getScheduleId();
        result = result * PRIME + ($scheduleId == null ? 43 : $scheduleId.hashCode());
        final Object $msmVo = this.getMsmVo();
        result = result * PRIME + ($msmVo == null ? 43 : $msmVo.hashCode());
        return result;
    }

    public String toString() {
        return "OrderMqVo(reservedNumber=" + this.getReservedNumber() + ", availableNumber=" + this.getAvailableNumber() + ", scheduleId=" + this.getScheduleId() + ", msmVo=" + this.getMsmVo() + ")";
    }
}

