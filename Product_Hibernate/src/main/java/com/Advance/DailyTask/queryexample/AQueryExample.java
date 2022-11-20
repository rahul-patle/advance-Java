package com.Advance.DailyTask.queryexample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class AQueryExample {

	GetSessionFactoryObject obj = new GetSessionFactoryObject();
	SessionFactory factory = obj.getSessionFactoryObject();

	public List<Product> getProductList() {

		List<Product> list = null;
		try {
			Session session = factory.openSession();
			// Criteria criteria = session.createCriteria(Product.class);

			String hql = "from Product";
			Query query = session.createQuery(hql);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return list;
	}

	public List<Product> getProductByNameQuery(String productName) {

		Session session = null;
		List<Product> list = null;
		try {
			session = factory.openSession();

			String hql = "FROM Product WHERE productName = :productName";

			Query query = session.createQuery(hql);
			query.setParameter("productName", productName);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public List<Product> getProductByPrice(double productPrice) {

		Session session = null;
		List<Product> list = null;

		session = factory.openSession();
		String hql = "FROM Product WHERE productPrice = :productPrice";

		Query query = session.createQuery(hql);
		query.setParameter("productPrice", productPrice);
		list = query.list();

		return list;

	}

}
