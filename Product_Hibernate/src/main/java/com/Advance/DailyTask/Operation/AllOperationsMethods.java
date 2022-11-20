package com.Advance.DailyTask.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.SessionFactory.GetSessionFactoryObject;

public class AllOperationsMethods {

	GetSessionFactoryObject opration = new GetSessionFactoryObject();
	SessionFactory factory = opration.getSessionFactoryObject();
	Session session = null;

	public Product GetMethod(int ProductId) {
		// Product product = new Product();
		Product product = null;
		try {

			session = factory.openSession();
			// assign Product ;
			product = session.get(Product.class, ProductId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;

	}

	public void saveData(Product product) {
		Session session = null;

		try {
			session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(product);

			transaction.commit();
			System.out.println("data saved");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}

// multiple data saved
	public void allListSave() {
		Session session = null;
		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			List<Product> arraylist = new ArrayList<Product>();
			// used constructor without id because use of autogeneration
			// if not then use constructor with id
			arraylist.add(new Product(13, "laptop", 20, 30));
			arraylist.add(new Product(14, "liscence", 40, 70));
			arraylist.add(new Product(15, "booklet", 30, 50));

			for (Product products : arraylist) {

				session.save(products);
			}
			transaction.commit();
			System.out.println("data saved");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}

	// delete data
	public void deletedata(int productId) {
		Session session = null;
		try {
			session = factory.openSession();
			Product product = session.get(Product.class, productId);
			Transaction transaction = session.beginTransaction();
			session.delete(product);
			// System.out.println(product);
			transaction.commit();
			System.out.println("data deleted");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	// update Data
	public void updateMethod(Product product) {
		// Product product = new Product(2, "pencil", 30, 40);
		Session session = null;
		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(product);
			System.out.println(product);
			transaction.commit();
			System.out.println("data updated");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	// Get input method
	public Product getInput() throws Exception {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter productId");
		// int ProductId = Integer.parseInt(bufferedReader.readLine());
		int ProductId = scanner.nextInt();

		System.out.println("enter ProductName");
		String ProductName = bufferedReader.readLine();

		System.out.println("enter productQuantity");
		int productQuantity = scanner.nextInt();

		System.out.println("enter productprice");
		double productPrice = scanner.nextDouble();
		return new Product(ProductId, ProductName, productQuantity, productPrice);

	}
}
