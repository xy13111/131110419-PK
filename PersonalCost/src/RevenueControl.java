import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;




import soft.cost.dao.RevenueSqlDAO;
import soft.cost.factory.HibernateSessionFactory;
import soft.cost.model.RevenueSql;

public class RevenueControl {

	/*	RoomControl 唯一实例
	 *  仿HibernateSessionFactory设计
	 */
	private static RevenueControl control = null; 
	public static RevenueControl getRevenueControl(){
		if(null==control){
			control = new RevenueControl();
		}
		return control;
	}
	
	/* RoomDAO
	 * RoomlevelDAO
	 * HibernateSession
	 */
	private RevenueSqlDAO RevenueSqlDAO = null;
	private Session session = null;
	public RevenueControl(){
		RevenueSqlDAO = new RevenueSqlDAO();
		session = HibernateSessionFactory.getSession();
	}
	
	/* 类方法
	 *
	 */
	public RevenueSql saveRevenue(Integer revenueID, float revenueMoney,Timestamp revenueDate,String revenueRemark,Integer isPlan){
		RevenueSql revenue = new RevenueSql(revenueID,revenueMoney,revenueDate,revenueRemark,isPlan);
		RevenueSqlDAO.save(revenue);
		session.flush();
		return revenue;
	}
}
//	public RevenueSql deleteroom(Integer roomId){
//		RevenueSql room = new RevenueSql();
//		List list = RevenueSqlDAO.findByRoomId(roomId);
//		RevenueSqlDAO.delete( ( (UmlRoom)list.get(0)));
//		umlroomDao.delete(room);
//		session.flush();
//		return room;
//	}
//	public List findRoom(Integer roomId){
//		List list = new UmlRoomDAO().findByRoomId(roomId);
//		session.flush();
//		return list;
//	}
//}