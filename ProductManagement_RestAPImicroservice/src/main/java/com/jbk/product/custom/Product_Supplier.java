package com.jbk.product.custom;

import com.jbk.product.entity.Product;
import com.jbk.product.model.Supplier;

public class Product_Supplier {

	private Product product;
	private Supplier supplier;

	public Product_Supplier(Product product, Supplier supplier) {
		super();
		this.product = product;
		this.supplier = supplier;
	}

	public Product_Supplier() {
		super();
		
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product_Supplier [product=" + product + ", supplier=" + supplier +"]";
	}

}
