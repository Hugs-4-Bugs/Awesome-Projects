package com.example.bitcoinmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bitcoinmining.service.WalletService;

@Controller
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/wallet")
    public String viewWallet(Model model) {
        // Retrieve wallet balance from WalletService
        double walletBalance = walletService.getWalletBalance();

        // Add wallet balance to the model
        model.addAttribute("walletBalance", walletBalance);

        // Return the name of the view to display (e.g., wallet.html)
        return "wallet";
    }
}
