package com.sjta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjta.service.TransactionService;

@RestController

@RequestMapping("/api/transactions")
public class TransactionController {
	
	 @Autowired
	    private TransactionService transactionService;
	 
	 @GetMapping("/details")
	    public List<Object[]> getAllTransactionDetails() {
	        return transactionService.getAllTransactionDetails();
	    }
	 	
	 
	
	 
	 
		/*
		 * @GetMapping public List<Transaction> getAllTransactions() { return
		 * transactionService.getAllTransactions(); }
		 * 
		 * @PostMapping public Transaction addTransaction(@RequestBody Transaction
		 * transaction) { return transactionService.addTransaction(transaction); }
		 */
}
