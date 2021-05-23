package com.atppp.yygh.model.order;

import com.atppp.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * RefundInfo
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "RefundInfo")
@TableName("refund_info")
public class RefundInfo extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "对外业务编号")
	@TableField("out_trade_no")
	private String outTradeNo;

	@ApiModelProperty(value = "订单编号")
	@TableField("order_id")
	private Long orderId;

	@ApiModelProperty(value = "支付类型（微信 支付宝）")
	@TableField("payment_type")
	private Integer paymentType;

	@ApiModelProperty(value = "交易编号")
	@TableField("trade_no")
	private String tradeNo;

	@ApiModelProperty(value = "退款金额")
	@TableField("total_amount")
	private BigDecimal totalAmount;

	@ApiModelProperty(value = "交易内容")
	@TableField("subject")
	private String subject;

	@ApiModelProperty(value = "退款状态")
	@TableField("refund_status")
	private Integer refundStatus;

	@ApiModelProperty(value = "回调时间")
	@TableField("callback_time")
	private Date callbackTime;

	@ApiModelProperty(value = "回调信息")
	@TableField("callback_content")
	private String callbackContent;

    public RefundInfo() {
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Integer getPaymentType() {
        return this.paymentType;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public String getSubject() {
        return this.subject;
    }

    public Integer getRefundStatus() {
        return this.refundStatus;
    }

    public Date getCallbackTime() {
        return this.callbackTime;
    }

    public String getCallbackContent() {
        return this.callbackContent;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RefundInfo)) return false;
        final RefundInfo other = (RefundInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$paymentType = this.getPaymentType();
        final Object other$paymentType = other.getPaymentType();
        if (this$paymentType == null ? other$paymentType != null : !this$paymentType.equals(other$paymentType))
            return false;
        final Object this$tradeNo = this.getTradeNo();
        final Object other$tradeNo = other.getTradeNo();
        if (this$tradeNo == null ? other$tradeNo != null : !this$tradeNo.equals(other$tradeNo)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$refundStatus = this.getRefundStatus();
        final Object other$refundStatus = other.getRefundStatus();
        if (this$refundStatus == null ? other$refundStatus != null : !this$refundStatus.equals(other$refundStatus))
            return false;
        final Object this$callbackTime = this.getCallbackTime();
        final Object other$callbackTime = other.getCallbackTime();
        if (this$callbackTime == null ? other$callbackTime != null : !this$callbackTime.equals(other$callbackTime))
            return false;
        final Object this$callbackContent = this.getCallbackContent();
        final Object other$callbackContent = other.getCallbackContent();
        if (this$callbackContent == null ? other$callbackContent != null : !this$callbackContent.equals(other$callbackContent))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RefundInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $paymentType = this.getPaymentType();
        result = result * PRIME + ($paymentType == null ? 43 : $paymentType.hashCode());
        final Object $tradeNo = this.getTradeNo();
        result = result * PRIME + ($tradeNo == null ? 43 : $tradeNo.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $refundStatus = this.getRefundStatus();
        result = result * PRIME + ($refundStatus == null ? 43 : $refundStatus.hashCode());
        final Object $callbackTime = this.getCallbackTime();
        result = result * PRIME + ($callbackTime == null ? 43 : $callbackTime.hashCode());
        final Object $callbackContent = this.getCallbackContent();
        result = result * PRIME + ($callbackContent == null ? 43 : $callbackContent.hashCode());
        return result;
    }

    public String toString() {
        return "RefundInfo(outTradeNo=" + this.getOutTradeNo() + ", orderId=" + this.getOrderId() + ", paymentType=" + this.getPaymentType() + ", tradeNo=" + this.getTradeNo() + ", totalAmount=" + this.getTotalAmount() + ", subject=" + this.getSubject() + ", refundStatus=" + this.getRefundStatus() + ", callbackTime=" + this.getCallbackTime() + ", callbackContent=" + this.getCallbackContent() + ")";
    }
}

