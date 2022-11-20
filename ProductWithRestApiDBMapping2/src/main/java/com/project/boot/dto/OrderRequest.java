package com.project.boot.dto;

import com.project.boot.entity.Supplier;

public class OrderRequest {

	
	private Supplier supplier;

	public OrderRequest(Supplier supplier) {
		super();
		this.supplier = supplier;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "OrderRequest [supplier=" + supplier + "]";
	}


	}
	
	
