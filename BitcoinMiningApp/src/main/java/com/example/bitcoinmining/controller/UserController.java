package com.example.bitcoinmining.controller;

import com.example.bitcoinmining.model.User;
import com.example.bitcoinmining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint to register a new user
    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        // Call the service method to authenticate the user
        boolean isAuthenticated = userService.authenticateUser(username, password);
        
        // Return a response based on authentication result
        if (isAuthenticated) {
            return "Login successful"; // Return success message or redirect to home page
        } else {
            return "Invalid username or password"; // Return error message
        }
    }
}

    