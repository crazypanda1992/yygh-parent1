package com.atppp.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "OrderCountVo")
public class OrderCountVo {
	
	@ApiModelProperty(value = "安排日期")
	private String reserveDate;

	@ApiModelProperty(value = "预约单数")
	private Integer count;

    public OrderCountVo() {
    }

    public String getReserveDate() {
        return this.reserveDate;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderCountVo)) return false;
        final OrderCountVo other = (OrderCountVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$reserveDate = this.getReserveDate();
        final Object other$reserveDate = other.getReserveDate();
        if (this$reserveDate == null ? other$reserveDate != null : !this$reserveDate.equals(other$reserveDate))
            return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderCountVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $reserveDate = this.getReserveDate();
        result = result * PRIME + ($reserveDate == null ? 43 : $reserveDate.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        return result;
    }

    public String toString() {
        return "OrderCountVo(reserveDate=" + this.getReserveDate() + ", count=" + this.getCount() + ")";
    }
}

