package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);
    List<Transaction> getUserTransactions(Long userId);
    // Add more transaction service methods as needed
}
