package soft.cost.model;

import java.sql.Timestamp;

/**
 * RevenueSql entity. @author MyEclipse Persistence Tools
 */
public class RevenueSql extends AbstractRevenueSql implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RevenueSql() {
	}

	/** full constructor */
	public RevenueSql(Integer revenueId, Float revenueMoney,
			Timestamp revenueDate, String revenueRemark, Integer isPlan) {
		super(revenueId, revenueMoney, revenueDate, revenueRemark, isPlan);
	}

}
