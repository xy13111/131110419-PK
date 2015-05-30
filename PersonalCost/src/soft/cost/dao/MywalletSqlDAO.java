package soft.cost.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soft.cost.model.MywalletSql;

/**
 * A data access object (DAO) providing persistence and search support for
 * MywalletSql entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see soft.cost.dao.MywalletSql
 * @author MyEclipse Persistence Tools
 */
public class MywalletSqlDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MywalletSqlDAO.class);
	// property constants
	public static final String TOTAL_REVENUE = "totalRevenue";
	public static final String TOTAL_EXPEND = "totalExpend";
	public static final String USE_MONEY = "useMoney";

	public void save(MywalletSql transientInstance) {
		log.debug("saving MywalletSql instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MywalletSql persistentInstance) {
		log.debug("deleting MywalletSql instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MywalletSql findById(java.lang.Integer id) {
		log.debug("getting MywalletSql instance with id: " + id);
		try {
			MywalletSql instance = (MywalletSql) getSession().get(
					"soft.cost.dao.MywalletSql", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MywalletSql instance) {
		log.debug("finding MywalletSql instance by example");
		try {
			List results = getSession()
					.createCriteria("soft.cost.dao.MywalletSql")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MywalletSql instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MywalletSql as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTotalRevenue(Object totalRevenue) {
		return findByProperty(TOTAL_REVENUE, totalRevenue);
	}

	public List findByTotalExpend(Object totalExpend) {
		return findByProperty(TOTAL_EXPEND, totalExpend);
	}

	public List findByUseMoney(Object useMoney) {
		return findByProperty(USE_MONEY, useMoney);
	}

	public List findAll() {
		log.debug("finding all MywalletSql instances");
		try {
			String queryString = "from MywalletSql";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MywalletSql merge(MywalletSql detachedInstance) {
		log.debug("merging MywalletSql instance");
		try {
			MywalletSql result = (MywalletSql) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MywalletSql instance) {
		log.debug("attaching dirty MywalletSql instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MywalletSql instance) {
		log.debug("attaching clean MywalletSql instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}