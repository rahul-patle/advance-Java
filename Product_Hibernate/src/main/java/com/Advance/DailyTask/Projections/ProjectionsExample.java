package com.Advance.DailyTask.Projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class ProjectionsExample {
// general return type

	GetSessionFactoryObject configure = new GetSessionFactoryObject();
	SessionFactory sessionfactory = configure.getSessionFactoryObject();

	// get list of product
	public List getProjectex() {

		Session session = sessionfactory.openSession();
		List list = null;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.sum("productprice"));
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;

	}

	// get sum
	// specific return type
	public double getProjectSum() {

		Session session = sessionfactory.openSession();
		List list = null;
		double sum = 0;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.sum("productprice"));
			list = criteria.list();
			sum = (Double) list.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return sum;

	}

	// get average
// specific return type
	public double getProjectionAvg() {

		Session session = sessionfactory.openSession();
		List list = null;
		double avg = 0;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.avg("productprice"));
			list = criteria.list();
			// take value from list at particular index
			avg = (Double) list.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return avg;

	}

	// get row count of productprice
	public double getProjectionCount() {

		Session session = sessionfactory.openSession();
		List list = null;
		double avg = 0;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.count("productprice"));
			list = criteria.list();
			// take value from list at particular index
			avg = (Double) list.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return avg;
	}

	// get max price
	public double getProjectionMax() {

		Session session = sessionfactory.openSession();
		List list = null;
		double max = 0;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.max("productprice"));
			list = criteria.list();
			// take value from list at particular index
			max = (Double) list.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return max;

	}

	public double getProjectionMin() {

		Session session = sessionfactory.openSession();
		List list = null;
		double min = 0;
		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.setProjection(Projections.min("productprice"));
			list = criteria.list();
			// take value from list at particular index
			min = (Double) list.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return min;
	}

	public Long getRowCount() {

		Session session = sessionfactory.openSession();
		// Class obj = Product.class;
		Long rowcount;

		Criteria criteria = session.createCriteria(Product.class);
		criteria.setProjection(Projections.rowCount());

		List list = criteria.list();
		rowcount = (Long) list.get(0);

		return rowcount;

	}

	public void getDistinct() {
		Session session = sessionfactory.openSession();
		// Class obj = Product.class;

		long distinct = 0;
		Criteria criteria = session.createCriteria(Product.class);
		criteria.setProjection(Projections.distinct(
				Projections.projectionList().add(Projections.distinct(Projections.property("productprice")))));
		// criteria.setProjection(Projections.countDistinct("productName"));
		List<Double> list = criteria.list();
		// distinct = list.get(0);
		for (Double string : list) {
			System.out.println(string);
		}
		// return distinct;
	}

	public void getDistinct2() {
		Session session = sessionfactory.openSession();
		// Class obj = Product.class;

		try {
			long distinct = 0;
			Criteria criteria = session.createCriteria(Product.class);
			// criteria.setProjection(Projections
			// .distinct(Projections.projectionList().add(Projections.distinct(Projections.property("productprice")))));

			// internally work (detailed of above)
			ProjectionList projectionList = Projections.projectionList();
			PropertyProjection pp = Projections.property("productprice");
			Projection projection = Projections.distinct(pp);
			projectionList.add(projection);

			// criteria.setProjection(Projections.countDistinct("productName"));
			List<Double> list = criteria.list();
			// distinct = list.get(0);
			for (Double string : list) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public List<Product> getMaxProduct() {

		Session session = sessionfactory.openSession();
		double max = 0;
		List<Product> list1 = null;
		try {

			Criteria criteria1 = session.createCriteria(Product.class);
			criteria1.setProjection(Projections.max("productprice"));
			// select *
			List list = criteria1.list();
			// max at get [0] index
			max = (Double) list.get(0);

			// Each operation new session object required

			Criteria criteria2 = session.createCriteria(Product.class);
			// productprice=max;
			Criterion critrion = Restrictions.eq("productprice", max);
			// add== where
			criteria2.add(critrion);

			list1 = criteria2.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return list1;

	}

}