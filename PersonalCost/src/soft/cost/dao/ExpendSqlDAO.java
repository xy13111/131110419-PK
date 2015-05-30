package soft.cost.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soft.cost.model.ExpendSql;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExpendSql entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see soft.cost.dao.ExpendSql
 * @author MyEclipse Persistence Tools
 */
public class ExpendSqlDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ExpendSqlDAO.class);
	// property constants
	public static final String EXPEND_MONEY = "expendMoney";
	public static final String EXPEND_REMARK = "expendRemark";
	public static final String IS_WRIGHT = "isWright";

	public void save(ExpendSql transientInstance) {
		log.debug("saving ExpendSql instance");
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

	public void delete(ExpendSql persistentInstance) {
		log.debug("deleting ExpendSql instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExpendSql findById(java.lang.Integer id) {
		log.debug("getting ExpendSql instance with id: " + id);
		try {
			ExpendSql instance = (ExpendSql) getSession().get(
					"soft.cost.dao.ExpendSql", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ExpendSql instance) {
		log.debug("finding ExpendSql instance by example");
		try {
			List results = getSession()
					.createCriteria("soft.cost.dao.ExpendSql")
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
		log.debug("finding ExpendSql instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ExpendSql as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExpendMoney(Object expendMoney) {
		return findByProperty(EXPEND_MONEY, expendMoney);
	}

	public List findByExpendRemark(Object expendRemark) {
		return findByProperty(EXPEND_REMARK, expendRemark);
	}

	public List findByIsWright(Object isWright) {
		return findByProperty(IS_WRIGHT, isWright);
	}

	public List findAll() {
		log.debug("finding all ExpendSql instances");
		try {
			String queryString = "from ExpendSql";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ExpendSql merge(ExpendSql detachedInstance) {
		log.debug("merging ExpendSql instance");
		try {
			ExpendSql result = (ExpendSql) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ExpendSql instance) {
		log.debug("attaching dirty ExpendSql instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExpendSql instance) {
		log.debug("attaching clean ExpendSql instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}