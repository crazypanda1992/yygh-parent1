package com.atppp.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Order")
public class OrderQueryVo {


	@ApiModelProperty(value = "会员id")
	private Long userId;
	
	@ApiModelProperty(value = "订单交易号")
	private String outTradeNo;

	@ApiModelProperty(value = "就诊人id")
	private Long patientId;

	@ApiModelProperty(value = "就诊人")
	private String patientName;

	@ApiModelProperty(value = "医院名称")
	private String keyword;

	@ApiModelProperty(value = "订单状态")
	private String orderStatus;

	@ApiModelProperty(value = "安排日期")
	private String reserveDate;

	@ApiModelProperty(value = "创建时间")
	private String createTimeBegin;
	private String createTimeEnd;

	public OrderQueryVo() {
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public Long getPatientId() {
		return this.patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public String getReserveDate() {
		return this.reserveDate;
	}

	public String getCreateTimeBegin() {
		return this.createTimeBegin;
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}

	public void setCreateTimeBegin(String createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof OrderQueryVo)) return false;
		final OrderQueryVo other = (OrderQueryVo) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$userId = this.getUserId();
		final Object other$userId = other.getUserId();
		if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
		final Object this$outTradeNo = this.getOutTradeNo();
		final Object other$outTradeNo = other.getOutTradeNo();
		if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
			return false;
		final Object this$patientId = this.getPatientId();
		final Object other$patientId = other.getPatientId();
		if (this$patientId == null ? other$patientId != null : !this$patientId.equals(other$patientId)) return false;
		final Object this$patientName = this.getPatientName();
		final Object other$patientName = other.getPatientName();
		if (this$patientName == null ? other$patientName != null : !this$patientName.equals(other$patientName))
			return false;
		final Object this$keyword = this.getKeyword();
		final Object other$keyword = other.getKeyword();
		if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
		final Object this$orderStatus = this.getOrderStatus();
		final Object other$orderStatus = other.getOrderStatus();
		if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
			return false;
		final Object this$reserveDate = this.getReserveDate();
		final Object other$reserveDate = other.getReserveDate();
		if (this$reserveDate == null ? other$reserveDate != null : !this$reserveDate.equals(other$reserveDate))
			return false;
		final Object this$createTimeBegin = this.getCreateTimeBegin();
		final Object other$createTimeBegin = other.getCreateTimeBegin();
		if (this$createTimeBegin == null ? other$createTimeBegin != null : !this$createTimeBegin.equals(other$createTimeBegin))
			return false;
		final Object this$createTimeEnd = this.getCreateTimeEnd();
		final Object other$createTimeEnd = other.getCreateTimeEnd();
		if (this$createTimeEnd == null ? other$createTimeEnd != null : !this$createTimeEnd.equals(other$createTimeEnd))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof OrderQueryVo;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $userId = this.getUserId();
		result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
		final Object $outTradeNo = this.getOutTradeNo();
		result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
		final Object $patientId = this.getPatientId();
		result = result * PRIME + ($patientId == null ? 43 : $patientId.hashCode());
		final Object $patientName = this.getPatientName();
		result = result * PRIME + ($patientName == null ? 43 : $patientName.hashCode());
		final Object $keyword = this.getKeyword();
		result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
		final Object $orderStatus = this.getOrderStatus();
		result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
		final Object $reserveDate = this.getReserveDate();
		result = result * PRIME + ($reserveDate == null ? 43 : $reserveDate.hashCode());
		final Object $createTimeBegin = this.getCreateTimeBegin();
		result = result * PRIME + ($createTimeBegin == null ? 43 : $createTimeBegin.hashCode());
		final Object $createTimeEnd = this.getCreateTimeEnd();
		result = result * PRIME + ($createTimeEnd == null ? 43 : $createTimeEnd.hashCode());
		return result;
	}

	public String toString() {
		return "OrderQueryVo(userId=" + this.getUserId() + ", outTradeNo=" + this.getOutTradeNo() + ", patientId=" + this.getPatientId() + ", patientName=" + this.getPatientName() + ", keyword=" + this.getKeyword() + ", orderStatus=" + this.getOrderStatus() + ", reserveDate=" + this.getReserveDate() + ", createTimeBegin=" + this.getCreateTimeBegin() + ", createTimeEnd=" + this.getCreateTimeEnd() + ")";
	}
}

