package com.project.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.boot.entity.Supplier;

public interface SupplierRepository extends  JpaRepository<Supplier, Integer> {

}
