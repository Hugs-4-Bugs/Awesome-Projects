package com.example.bitcoinmining.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MiningServiceTest {

    @Test
    public void testStartMining() {
        MiningService miningService = new MiningService();
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        miningService.startMining();
        
        // Restore original System.out
        System.setOut(System.out);
        
        // Check console output
        String consoleOutput = outputStream.toString();
        assertTrue(consoleOutput.contains("Mining started"), "Console output should indicate mining started");
    }

    @Test
    public void testStopMining() {
        MiningService miningService = new MiningService();
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        miningService.stopMining();
        
        // Restore original System.out
        System.setOut(System.out);
        
        // Check console output
        String consoleOutput = outputStream.toString();
        assertTrue(consoleOutput.contains("Mining stopped"), "Console output should indicate mining stopped");
    }
}
