package com.example.bitcoinmining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MiningController {

    private boolean miningInProgress = false;

    @GetMapping("/startMining")
    @ResponseBody
    public String startMining() {
        if (!miningInProgress) {
            miningInProgress = true;
            // Simulate mining start logic
            System.out.println("Mining started");
            return "Mining started";
        } else {
            return "Mining is already in progress";
        }
    }

    @GetMapping("/stopMining")
    @ResponseBody
    public String stopMining() {
        if (miningInProgress) {
            miningInProgress = false;
            // Simulate mining stop logic
            System.out.println("Mining stopped");
            return "Mining stopped";
        } else {
            return "Mining is not in progress";
        }
    }
}
