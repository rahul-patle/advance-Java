package com.Advance.DailyTask.SessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Advance.DailyTask.Entity.Product;

public class GetSessionFactoryObject {
		public  SessionFactory  getSessionFactoryObject () {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Product.class);
			SessionFactory factory = configuration.buildSessionFactory();
			return factory;
			
		}

	
}
