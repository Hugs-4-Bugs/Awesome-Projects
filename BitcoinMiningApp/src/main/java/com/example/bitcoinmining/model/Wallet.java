package com.example.bitcoinmining.model;

public class Wallet {

    private double balance;
    private String address;
    private String privateKey;

    // Constructor
    public Wallet(double balance, String address, String privateKey) {
        this.balance = balance;
        this.address = address;
        this.privateKey = privateKey;
    }

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
