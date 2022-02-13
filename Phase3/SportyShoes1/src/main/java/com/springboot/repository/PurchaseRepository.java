package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}