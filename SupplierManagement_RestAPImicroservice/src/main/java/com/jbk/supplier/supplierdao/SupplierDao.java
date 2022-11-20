package com.jbk.supplier.supplierdao;

import java.util.List;

import com.jbk.supplier.entity.Supplier;



public interface SupplierDao {

	public boolean saveSupplier(Supplier supplier);
	
	public List<Supplier> getAllSupplier() ;
	
	public Supplier getSupplierById(int supplierId) ;	
}
