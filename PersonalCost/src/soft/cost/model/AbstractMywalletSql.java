package soft.cost.model;

/**
 * AbstractMywalletSql entity provides the base persistence definition of the
 * MywalletSql entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMywalletSql implements java.io.Serializable {

	// Fields

	private Integer walletId;
	private Float totalRevenue;
	private Float totalExpend;
	private Float useMoney;

	// Constructors

	/** default constructor */
	public AbstractMywalletSql() {
	}

	/** full constructor */
	public AbstractMywalletSql(Integer walletId, Float totalRevenue,
			Float totalExpend, Float useMoney) {
		this.walletId = walletId;
		this.totalRevenue = totalRevenue;
		this.totalExpend = totalExpend;
		this.useMoney = useMoney;
	}

	// Property accessors

	public Integer getWalletId() {
		return this.walletId;
	}

	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}

	public Float getTotalRevenue() {
		return this.totalRevenue;
	}

	public void setTotalRevenue(Float totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public Float getTotalExpend() {
		return this.totalExpend;
	}

	public void setTotalExpend(Float totalExpend) {
		this.totalExpend = totalExpend;
	}

	public Float getUseMoney() {
		return this.useMoney;
	}

	public void setUseMoney(Float useMoney) {
		this.useMoney = useMoney;
	}

}