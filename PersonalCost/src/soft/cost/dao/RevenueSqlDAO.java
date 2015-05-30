package soft.cost.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soft.cost.model.RevenueSql;

/**
 * A data access object (DAO) providing persistence and search support for
 * RevenueSql entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see soft.cost.dao.RevenueSql
 * @author MyEclipse Persistence Tools
 */
public class RevenueSqlDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RevenueSqlDAO.class);
	// property constants
	public static final String REVENUE_MONEY = "revenueMoney";
	public static final String REVENUE_REMARK = "revenueRemark";
	public static final String IS_PLAN = "isPlan";

	public void save(RevenueSql transientInstance) {
		log.debug("saving RevenueSql instance");
		Transaction transaction = getSession().beginTransaction();
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		transaction.commit();
		getSession().flush();
	}

	public void delete(RevenueSql persistentInstance) {
		log.debug("deleting RevenueSql instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RevenueSql findById(java.lang.Integer id) {
		log.debug("getting RevenueSql instance with id: " + id);
		try {
			RevenueSql instance = (RevenueSql) getSession().get(
					"soft.cost.dao.RevenueSql", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RevenueSql instance) {
		log.debug("finding RevenueSql instance by example");
		try {
			List results = getSession()
					.createCriteria("soft.cost.dao.RevenueSql")
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
		log.debug("finding RevenueSql instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RevenueSql as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRevenueMoney(Object revenueMoney) {
		return findByProperty(REVENUE_MONEY, revenueMoney);
	}

	public List findByRevenueRemark(Object revenueRemark) {
		return findByProperty(REVENUE_REMARK, revenueRemark);
	}

	public List findByIsPlan(Object isPlan) {
		return findByProperty(IS_PLAN, isPlan);
	}

	public List findAll() {
		log.debug("finding all RevenueSql instances");
		try {
			String queryString = "from RevenueSql";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RevenueSql merge(RevenueSql detachedInstance) {
		log.debug("merging RevenueSql instance");
		try {
			RevenueSql result = (RevenueSql) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RevenueSql instance) {
		log.debug("attaching dirty RevenueSql instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RevenueSql instance) {
		log.debug("attaching clean RevenueSql instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findRevenueID(Integer roomId) {
		// TODO Auto-generated method stub
		return null;
	}
}