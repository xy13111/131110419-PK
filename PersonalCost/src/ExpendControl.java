import java.sql.Timestamp;
import java.util.Set;

import org.hibernate.Session;







import soft.cost.dao.ExpendSqlDAO;
import soft.cost.dao.RevenueSqlDAO;
import soft.cost.factory.HibernateSessionFactory;
import soft.cost.model.ExpendSql;
import soft.cost.model.RevenueSql;

public class ExpendControl {

	/*	RoomControl 唯一实例
	 *  仿HibernateSessionFactory设计
	 */
	private static ExpendControl control = null; 
	public static ExpendControl getRevenueControl(){
		if(null==control){
			control = new ExpendControl();
		}
		return control;
	}
	
	/* RoomDAO
	 * RoomlevelDAO
	 * HibernateSession
	 */
	private ExpendSqlDAO ExpendSqlDAO = null;
	private Session session = null;
	public ExpendControl(){
		ExpendSqlDAO = new ExpendSqlDAO();
		session = HibernateSessionFactory.getSession();
	}
	
	/* 类方法
	 *
	 */
	public ExpendSql saveExpend(Integer expendID, float expendMoney,Timestamp expendDate,String expendRemark,Integer isWright){
		ExpendSql expend = new ExpendSql(expendID,expendMoney,expendDate,expendRemark,isWright);
		ExpendSqlDAO.save(expend);
		session.flush();
		return expend;
	}
}