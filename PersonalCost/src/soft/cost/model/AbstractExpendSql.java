package soft.cost.model;

import java.sql.Timestamp;

/**
 * AbstractExpendSql entity provides the base persistence definition of the
 * ExpendSql entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExpendSql implements java.io.Serializable {

	// Fields

	private Integer expendId;
	private Float expendMoney;
	private Timestamp expendDate;
	private String expendRemark;
	private Integer isWright;

	// Constructors

	/** default constructor */
	public AbstractExpendSql() {
	}

	/** full constructor */
	public AbstractExpendSql(Integer expendId, Float expendMoney,
			Timestamp expendDate, String expendRemark, Integer isWright) {
		this.expendId = expendId;
		this.expendMoney = expendMoney;
		this.expendDate = expendDate;
		this.expendRemark = expendRemark;
		this.isWright = isWright;
	}

	// Property accessors

	public Integer getExpendId() {
		return this.expendId;
	}

	public void setExpendId(Integer expendId) {
		this.expendId = expendId;
	}

	public Float getExpendMoney() {
		return this.expendMoney;
	}

	public void setExpendMoney(Float expendMoney) {
		this.expendMoney = expendMoney;
	}

	public Timestamp getExpendDate() {
		return this.expendDate;
	}

	public void setExpendDate(Timestamp expendDate) {
		this.expendDate = expendDate;
	}

	public String getExpendRemark() {
		return this.expendRemark;
	}

	public void setExpendRemark(String expendRemark) {
		this.expendRemark = expendRemark;
	}

	public Integer getIsWright() {
		return this.isWright;
	}

	public void setIsWright(Integer isWright) {
		this.isWright = isWright;
	}

}