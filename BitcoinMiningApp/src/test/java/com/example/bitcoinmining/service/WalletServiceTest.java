package com.example.bitcoinmining.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WalletServiceTest {

    @Test
    public void testGetWalletBalance() {
        WalletService walletService = new WalletService();
        double balance = walletService.getWalletBalance();
        // Add assertions or check balance value if necessary
        assertTrue(balance >= 0.0, "Wallet balance should be non-negative");
    }
}
