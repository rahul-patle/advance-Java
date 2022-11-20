package com.Advance.DailyTask.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class SecondLevelCache {

	public static void main(String[] args) {
// usefor session factory
		
		
		SessionFactory factory = new GetSessionFactoryObject().getSessionFactoryObject();
		Session session1 = factory.openSession();
		Session session2 = factory.openSession();

		Product product1 = session1.get(Product.class, 1);
		System.out.println(product1);

		Product product2 = session2.get(Product.class, 1);
		System.out.println(product2);

	}
}
