package com.Advance.DailyTask.Restrictions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class Restrictionsuse {

	public List<Product> getdetails() {
		GetSessionFactoryObject operation = new GetSessionFactoryObject();
		SessionFactory factory = operation.getSessionFactoryObject();
		List<Product> list = null;
		try {
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(Product.class);

			// For single filter condition
			// for where condition add is used
			criteria.add(Restrictions.eq("productName", "booklet"));
			// criteria.add(Restrictions.like("productName", "B%"));
			// criteria.add(Restrictions.like("productName", "%e"));

			// For Multiple filter condition
			// we can give multiple conditions (name and price)
			// Criterion name =(Restrictions.eq("productName", "booklet"));
			// Criterion quantity =(Restrictions.eq("productQuantity",30));

			// criteria.add(Restrictions.or(name,quantity));
			// criteria.add(Restrictions.and(name,quantity));
			// criteria.add(Restrictions.eq(price));

			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		// use restrictions
		Restrictionsuse rest = new Restrictionsuse();
		List<Product> product = rest.getdetails();
		for (Product product2 : product) {
			System.out.println(product2);
		}
	}
}
