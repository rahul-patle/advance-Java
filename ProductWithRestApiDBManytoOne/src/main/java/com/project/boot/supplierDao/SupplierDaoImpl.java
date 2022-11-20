package com.project.boot.supplierDao;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.boot.entity.Product;
import com.project.boot.entity.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public boolean saveSupplier(Supplier supplier) {

		Session session = null;
		Transaction transaction = null;
		boolean dataSaved = false;
		try {
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			session.save(supplier);
			transaction.commit();
			System.out.println(supplier);
			dataSaved = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSaved;

	}

	@Override
	public Supplier getproduct() {

		Session session = null;
		Transaction transaction = null;
		boolean dataSaved = false;
		Supplier supplier = null;
		try {
			session = sessionfactory.openSession();
			supplier = session.load(Supplier.class, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return supplier;

	}

}
