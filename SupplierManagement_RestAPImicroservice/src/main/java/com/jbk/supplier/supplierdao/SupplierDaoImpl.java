package com.jbk.supplier.supplierdao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.supplier.entity.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveSupplier(Supplier supplier) {
		boolean isAdded = false;
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(supplier);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;

	}

	@Override
	public List<Supplier> getAllSupplier() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Supplier.class);
		List list = criteria.list();

		return list;
	}

	@Override
	public Supplier getSupplierById(int supplierId) 	{
		Session session = sessionFactory.openSession();
		Supplier supplier = session.get(Supplier.class, 1);
		return supplier;
	}
}