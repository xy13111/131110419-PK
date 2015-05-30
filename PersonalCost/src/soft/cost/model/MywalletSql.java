package soft.cost.model;

/**
 * MywalletSql entity. @author MyEclipse Persistence Tools
 */
public class MywalletSql extends AbstractMywalletSql implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MywalletSql() {
	}

	/** full constructor */
	public MywalletSql(Integer walletId, Float totalRevenue, Float totalExpend,
			Float useMoney) {
		super(walletId, totalRevenue, totalExpend, useMoney);
	}

}
