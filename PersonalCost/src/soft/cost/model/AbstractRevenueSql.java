package soft.cost.model;

import java.sql.Timestamp;

/**
 * AbstractRevenueSql entity provides the base persistence definition of the
 * RevenueSql entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRevenueSql implements java.io.Serializable {

	// Fields

	private Integer revenueId;
	private Float revenueMoney;
	private Timestamp revenueDate;
	private String revenueRemark;
	private Integer isPlan;

	// Constructors

	/** default constructor */
	public AbstractRevenueSql() {
	}

	/** full constructor */
	public AbstractRevenueSql(Integer revenueId, Float revenueMoney,
			Timestamp revenueDate, String revenueRemark, Integer isPlan) {
		this.revenueId = revenueId;
		this.revenueMoney = revenueMoney;
		this.revenueDate = revenueDate;
		this.revenueRemark = revenueRemark;
		this.isPlan = isPlan;
	}

	// Property accessors

	public Integer getRevenueId() {
		return this.revenueId;
	}

	public void setRevenueId(Integer revenueId) {
		this.revenueId = revenueId;
	}

	public Float getRevenueMoney() {
		return this.revenueMoney;
	}

	public void setRevenueMoney(Float revenueMoney) {
		this.revenueMoney = revenueMoney;
	}

	public Timestamp getRevenueDate() {
		return this.revenueDate;
	}

	public void setRevenueDate(Timestamp revenueDate) {
		this.revenueDate = revenueDate;
	}

	public String getRevenueRemark() {
		return this.revenueRemark;
	}

	public void setRevenueRemark(String revenueRemark) {
		this.revenueRemark = revenueRemark;
	}

	public Integer getIsPlan() {
		return this.isPlan;
	}

	public void setIsPlan(Integer isPlan) {
		this.isPlan = isPlan;
	}

}