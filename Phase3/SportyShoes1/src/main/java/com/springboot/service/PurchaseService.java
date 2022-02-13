package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Purchase;
import com.springboot.repository.PurchaseRepository;

@Service
public class PurchaseService {

	@Autowired
	PurchaseRepository purchaseRepository;

	public List<Purchase> getAllPurchases() {

		return purchaseRepository.findAll();

	}

}
