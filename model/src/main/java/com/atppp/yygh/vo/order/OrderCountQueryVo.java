package com.atppp.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "OrderCountQueryVo")
public class OrderCountQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hoscode;

	@ApiModelProperty(value = "医院名称")
	private String hosname;

	@ApiModelProperty(value = "安排日期")
	private String reserveDateBegin;
	private String reserveDateEnd;

    public OrderCountQueryVo() {
    }

    public String getHoscode() {
        return this.hoscode;
    }

    public String getHosname() {
        return this.hosname;
    }

    public String getReserveDateBegin() {
        return this.reserveDateBegin;
    }

    public String getReserveDateEnd() {
        return this.reserveDateEnd;
    }

    public void setHoscode(String hoscode) {
        this.hoscode = hoscode;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public void setReserveDateBegin(String reserveDateBegin) {
        this.reserveDateBegin = reserveDateBegin;
    }

    public void setReserveDateEnd(String reserveDateEnd) {
        this.reserveDateEnd = reserveDateEnd;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderCountQueryVo)) return false;
        final OrderCountQueryVo other = (OrderCountQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hoscode = this.getHoscode();
        final Object other$hoscode = other.getHoscode();
        if (this$hoscode == null ? other$hoscode != null : !this$hoscode.equals(other$hoscode)) return false;
        final Object this$hosname = this.getHosname();
        final Object other$hosname = other.getHosname();
        if (this$hosname == null ? other$hosname != null : !this$hosname.equals(other$hosname)) return false;
        final Object this$reserveDateBegin = this.getReserveDateBegin();
        final Object other$reserveDateBegin = other.getReserveDateBegin();
        if (this$reserveDateBegin == null ? other$reserveDateBegin != null : !this$reserveDateBegin.equals(other$reserveDateBegin))
            return false;
        final Object this$reserveDateEnd = this.getReserveDateEnd();
        final Object other$reserveDateEnd = other.getReserveDateEnd();
        if (this$reserveDateEnd == null ? other$reserveDateEnd != null : !this$reserveDateEnd.equals(other$reserveDateEnd))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderCountQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hoscode = this.getHoscode();
        result = result * PRIME + ($hoscode == null ? 43 : $hoscode.hashCode());
        final Object $hosname = this.getHosname();
        result = result * PRIME + ($hosname == null ? 43 : $hosname.hashCode());
        final Object $reserveDateBegin = this.getReserveDateBegin();
        result = result * PRIME + ($reserveDateBegin == null ? 43 : $reserveDateBegin.hashCode());
        final Object $reserveDateEnd = this.getReserveDateEnd();
        result = result * PRIME + ($reserveDateEnd == null ? 43 : $reserveDateEnd.hashCode());
        return result;
    }

    public String toString() {
        return "OrderCountQueryVo(hoscode=" + this.getHoscode() + ", hosname=" + this.getHosname() + ", reserveDateBegin=" + this.getReserveDateBegin() + ", reserveDateEnd=" + this.getReserveDateEnd() + ")";
    }
}

