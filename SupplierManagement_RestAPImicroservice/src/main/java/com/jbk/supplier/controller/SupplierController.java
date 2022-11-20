package com.jbk.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.supplier.entity.Supplier;
import com.jbk.supplier.supplierservice.SupplierService;

@RestController
@RequestMapping(value = "supplier")
public class SupplierController {

	@Autowired
	private SupplierService service;

	@PostMapping(value = "/saveSupplier")
	public ResponseEntity<Boolean> saveSupplier(@RequestBody Supplier supplier) {// Data validation

		boolean isAdded = service.saveSupplier(supplier);
		if (isAdded) {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.OK);
		} else {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/getAllProduct")
	public ResponseEntity<List<Supplier>> getAllSupplier() {
		List<Supplier> allSupplier = service.getAllSupplier();
		if (allSupplier != null) {
			return new ResponseEntity<List<Supplier>>(allSupplier, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Supplier>>(allSupplier, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/getSupplierById/{supplierId}")
	public ResponseEntity<Supplier> getSupplierById(@PathVariable  int supplierId) {
		Supplier supplierById = service.getSupplierById(supplierId);
		if (supplierById != null) {
			return new ResponseEntity<Supplier>(supplierById, HttpStatus.OK);
		} else {
			return new ResponseEntity<Supplier>(supplierById, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}