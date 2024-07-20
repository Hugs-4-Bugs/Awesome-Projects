package com.example.bitcoinmining.repository;

import com.example.bitcoinmining.model.Transaction;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	Transaction save(Transaction transaction);
    // Add custom query methods if needed

	List<Transaction> findAllByUserId(Long Id);
}
