package com.example.bitcoinmining.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LoggingServiceTest {

    @Autowired
    private LoggingService loggingService;

    @Test
    public void testLogMessage() {
        // Redirect System.out to capture console output (logs)
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Test log message
        String message = "Test log message";
        loggingService.logMessage(message);

        // Restore original System.out
        System.setOut(originalOut);

        // Convert captured logs to string
        String logs = outputStream.toString();

        // Verify that the message is logged successfully
        assertTrue(logs.contains(message), "Message is logged successfully");
    }

    // Add more test methods for LoggingService
}
