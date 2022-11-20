package com.project.boot.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.project.boot.entity.Product;
import com.project.boot.entity.Supplier;
import com.project.boot.supplierService.SupplierService;



@RestController
public class ProductController {

	@Autowired
	private SupplierService service;

//	@PostMapping(value = "/saveProduct")
//	public ResponseEntity<Boolean> saveProduct(@Valid @RequestBody Product product) throws Exception {
//		boolean isAdded = service.saveProduct(product);
//
//		if (isAdded) {
//			// type must be wrapper class
//			return new ResponseEntity<Boolean>(isAdded, HttpStatus.CREATED);
//		} else {
//			throw new ProductAlreadyExistException("product already exist ");
//		}
//	}
	
	@PostMapping (value = "/saveSupplier")
	public boolean saveSupplier( @RequestBody Supplier supplier )  {
		boolean isAdded = service.saveSupplier(supplier);
		return isAdded;
	}
}