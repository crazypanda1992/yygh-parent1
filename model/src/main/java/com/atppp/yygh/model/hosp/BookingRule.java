package com.atppp.yygh.model.hosp;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * RegisterRule
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "预约规则")
@Document("BookingRule")
public class BookingRule {
	
	@ApiModelProperty(value = "预约周期")
	private Integer cycle;

	@ApiModelProperty(value = "放号时间")
	private String releaseTime;

	@ApiModelProperty(value = "停挂时间")
	private String stopTime;

	@ApiModelProperty(value = "退号截止天数（如：就诊前一天为-1，当天为0）")
	private Integer quitDay;

	@ApiModelProperty(value = "退号时间")
	private String quitTime;

	@ApiModelProperty(value = "预约规则")
	private List<String> rule;

    public BookingRule() {
    }

    /**
	 *
	 * @param rule
	 */
	public void setRule(String rule) {
		if(!StringUtils.isEmpty(rule)) {
			this.rule = JSONArray.parseArray(rule, String.class);
		}
	}

    public Integer getCycle() {
        return this.cycle;
    }

    public String getReleaseTime() {
        return this.releaseTime;
    }

    public String getStopTime() {
        return this.stopTime;
    }

    public Integer getQuitDay() {
        return this.quitDay;
    }

    public String getQuitTime() {
        return this.quitTime;
    }

    public List<String> getRule() {
        return this.rule;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public void setQuitDay(Integer quitDay) {
        this.quitDay = quitDay;
    }

    public void setQuitTime(String quitTime) {
        this.quitTime = quitTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BookingRule)) return false;
        final BookingRule other = (BookingRule) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cycle = this.getCycle();
        final Object other$cycle = other.getCycle();
        if (this$cycle == null ? other$cycle != null : !this$cycle.equals(other$cycle)) return false;
        final Object this$releaseTime = this.getReleaseTime();
        final Object other$releaseTime = other.getReleaseTime();
        if (this$releaseTime == null ? other$releaseTime != null : !this$releaseTime.equals(other$releaseTime))
            return false;
        final Object this$stopTime = this.getStopTime();
        final Object other$stopTime = other.getStopTime();
        if (this$stopTime == null ? other$stopTime != null : !this$stopTime.equals(other$stopTime)) return false;
        final Object this$quitDay = this.getQuitDay();
        final Object other$quitDay = other.getQuitDay();
        if (this$quitDay == null ? other$quitDay != null : !this$quitDay.equals(other$quitDay)) return false;
        final Object this$quitTime = this.getQuitTime();
        final Object other$quitTime = other.getQuitTime();
        if (this$quitTime == null ? other$quitTime != null : !this$quitTime.equals(other$quitTime)) return false;
        final Object this$rule = this.getRule();
        final Object other$rule = other.getRule();
        if (this$rule == null ? other$rule != null : !this$rule.equals(other$rule)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BookingRule;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cycle = this.getCycle();
        result = result * PRIME + ($cycle == null ? 43 : $cycle.hashCode());
        final Object $releaseTime = this.getReleaseTime();
        result = result * PRIME + ($releaseTime == null ? 43 : $releaseTime.hashCode());
        final Object $stopTime = this.getStopTime();
        result = result * PRIME + ($stopTime == null ? 43 : $stopTime.hashCode());
        final Object $quitDay = this.getQuitDay();
        result = result * PRIME + ($quitDay == null ? 43 : $quitDay.hashCode());
        final Object $quitTime = this.getQuitTime();
        result = result * PRIME + ($quitTime == null ? 43 : $quitTime.hashCode());
        final Object $rule = this.getRule();
        result = result * PRIME + ($rule == null ? 43 : $rule.hashCode());
        return result;
    }

    public String toString() {
        return "BookingRule(cycle=" + this.getCycle() + ", releaseTime=" + this.getReleaseTime() + ", stopTime=" + this.getStopTime() + ", quitDay=" + this.getQuitDay() + ", quitTime=" + this.getQuitTime() + ", rule=" + this.getRule() + ")";
    }
}

