package com.jbk.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	private String productId; // camel case

	@NotNull(message = "ProductName is required")
	private String productName;

	@Min(1)
	
	private int productQty;

	@Min(1)
	private double productPrice;

	@NotNull(message = "ProductType is required")
	private String productType;

	@Min(1)
	int supplierId;
	
	public Product() {
		super();
	}

	public Product(String productId, @NotNull(message = "ProductName is required") String productName,
			@Min(1) int productQty, @Min(1) double productPrice,
			@NotNull(message = "ProductType is required") String productType, @Min(1) int supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.productType = productType;
		this.supplierId = supplierId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productType=" + productType + ", supplierId=" + supplierId
				+ "]";
	}
}

	