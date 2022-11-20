package com.jbk.supplier.supplierservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jbk.supplier.entity.Supplier;
import com.jbk.supplier.supplierdao.SupplierDao;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierDao dao;

	public boolean saveSupplier(Supplier supplier) {
		boolean saveSupplier = dao.saveSupplier(supplier);
		return saveSupplier;
	}

	public List<Supplier> getAllSupplier() {
		List<Supplier> allSupplier = dao.getAllSupplier();
		return allSupplier;
	}

	@Override
	public Supplier getSupplierById(int supplierId) {
		Supplier supplierById = dao.getSupplierById(supplierId);
		return supplierById;
	}

}
