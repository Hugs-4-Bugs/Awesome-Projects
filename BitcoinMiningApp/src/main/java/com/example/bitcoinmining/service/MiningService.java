package com.example.bitcoinmining.service;

import org.springframework.stereotype.Service;

@Service
public class MiningService {

    private boolean miningInProgress = false;

    public void startMining() {
        if (!miningInProgress) {
            miningInProgress = true;
            new Thread(() -> {
                // Simulate mining process
                while (miningInProgress) {
                    // Perform mining operations
                    System.out.println("Mining Bitcoin...");
                    try {
                        // Simulate mining time (e.g., 1 second)
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println("Mining started");
        } else {
            System.out.println("Mining is already in progress");
        }
    }

    public void stopMining() {
        if (miningInProgress) {
            miningInProgress = false;
            System.out.println("Mining stopped");
        } else {
            System.out.println("Mining is not in progress");
        }
    }
}
