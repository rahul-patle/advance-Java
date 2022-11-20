package com.Advance.DailyTask.Cache;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class FirstLevelCache {

	public static void main(String[] args) {
/**
 * first level cache is by default present in session  
 * cache is temporary storage while program is running
 */
		SessionFactory factory = new GetSessionFactoryObject().getSessionFactoryObject();
		Session session = factory.openSession();

		Product product = session.get(Product.class, 1);
		System.out.println(product);
		
		Product product1 = session.get(Product.class, 1);
		System.out.println(product);


	}
}