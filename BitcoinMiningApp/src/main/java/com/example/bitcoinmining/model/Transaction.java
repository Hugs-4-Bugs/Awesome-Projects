package com.example.bitcoinmining.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private double amount;
    private Date timestamp;
    // Add more transaction fields as needed
	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

    // Getters and setters
	
}
