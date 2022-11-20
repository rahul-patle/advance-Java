package com.Advance.DailyTask.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class NotEqualToExample {

	public static void main(String[] args) {
		GetSessionFactoryObject configure = new GetSessionFactoryObject();
		SessionFactory sessionfatory = configure.getSessionFactoryObject();
		Session session = sessionfatory.openSession();

		Class<Product> obj = Product.class; // class object
		Criteria criteria = session.createCriteria(obj); // class object
		Criterion name = Restrictions.eq("productName", "Booklet");
		Criterion criterion = Restrictions.not(name);

		criteria.add(name);
		List<Product> list = criteria.list();

		for (Product product : list) {
			System.out.println(product);
		}
	}

}
