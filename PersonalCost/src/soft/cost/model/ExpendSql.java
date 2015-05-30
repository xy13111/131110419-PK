package soft.cost.model;

import java.sql.Timestamp;

/**
 * ExpendSql entity. @author MyEclipse Persistence Tools
 */
public class ExpendSql extends AbstractExpendSql implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExpendSql() {
	}

	/** full constructor */
	public ExpendSql(Integer expendId, Float expendMoney, Timestamp expendDate,
			String expendRemark, Integer isWright) {
		super(expendId, expendMoney, expendDate, expendRemark, isWright);
	}

}
