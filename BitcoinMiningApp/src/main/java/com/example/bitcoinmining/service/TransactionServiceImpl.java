package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.Transaction;
import com.example.bitcoinmining.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction addTransaction(Transaction transaction) {
        // Implement transaction addition logic (e.g., validation, processing, etc.)
        // For example, you can add validation to ensure the transaction amount is positive
        if (transaction.getAmount() <= 0) {
            throw new IllegalArgumentException("Transaction amount must be positive");
        }
        
        // Process the transaction (if needed)
        // For example, you can update the user's wallet balance
        
        // Save the transaction to the database
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getUserTransactions(Long userId) {
        // Implement logic to retrieve transactions for a user
        return transactionRepository.findAllByUserId(userId);
    }
}
