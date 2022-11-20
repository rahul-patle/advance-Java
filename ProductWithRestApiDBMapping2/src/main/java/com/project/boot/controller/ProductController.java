package com.project.boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.boot.dto.OrderRequest;
import com.project.boot.entity.Supplier;
import com.project.boot.repository.ProductRepository;
import com.project.boot.repository.SupplierRepository;



@RestController
public class ProductController {

	// @Autowired
	// private SupplierService service;

	@Autowired
	private SupplierRepository supplierRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/PlaceOrder")
	public Supplier placeOrder(@RequestBody OrderRequest request) {
		return supplierRepository.save(request.getSupplier());

	}
	@GetMapping("/findAllOrders")
	public List<Supplier> getSupplier() {
		return supplierRepository.findAll();

	}
	


	
	
}
