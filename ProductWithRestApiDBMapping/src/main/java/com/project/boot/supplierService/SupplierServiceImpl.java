package com.project.boot.supplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.boot.entity.Product;
import com.project.boot.entity.Supplier;
import com.project.boot.supplierDao.SupplierDao;

@Service

public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierDao Dao;

	@Override
	public boolean saveSupplier(Supplier supplier) {
		boolean dataSaved = Dao.saveSupplier(supplier);
		return dataSaved;
	}

}