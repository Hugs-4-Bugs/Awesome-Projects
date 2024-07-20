package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void testAddTransaction() {
        Transaction transaction = new Transaction();
        // Set transaction details
        Transaction savedTransaction = transactionService.addTransaction(transaction);
        
        assertNotNull(savedTransaction.getId());
        // Add more assertions as needed
    }

    // Add more test methods for TransactionService
}
