package com.project.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.boot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
