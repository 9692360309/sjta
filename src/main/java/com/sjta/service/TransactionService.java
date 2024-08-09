package com.sjta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjta.entity.Transaction;
import com.sjta.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	

	public List<Object[]> getAllTransactionDetails() {
		return transactionRepository.findAllTransactionDetails();
	}

	public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}

	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
}
