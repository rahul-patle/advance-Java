package com.jbk.supplier.supplierservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jbk.supplier.entity.Supplier;

public interface SupplierService {

	public boolean saveSupplier(Supplier supplier);

	public List<Supplier> getAllSupplier();
	
	public Supplier getSupplierById(int supplierId) ;
}
