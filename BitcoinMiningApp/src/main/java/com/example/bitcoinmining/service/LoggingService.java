package com.example.bitcoinmining.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    // Method to log a message at INFO level
    public void logInfo(String message) {
        logger.info(message);
    }

    // Method to log a message at DEBUG level
    public void logDebug(String message) {
        logger.debug(message);
    }

    // Method to log a message at ERROR level
    public void logError(String message) {
        logger.error(message);
    }

	public void logMessage(String message) {
		// TODO Auto-generated method stub
		// Log the message at INFO level
	    logInfo(message);
		
	}
	
	

    // Add more methods for different logging levels or additional logging functionality
}
