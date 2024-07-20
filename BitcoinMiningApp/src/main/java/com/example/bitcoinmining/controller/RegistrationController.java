package com.example.bitcoinmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bitcoinmining.service.UserService;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("password") String password) {
        // Encrypt the password
        String encodedPassword = passwordEncoder.encode(password);
        
        // Save the user details to the database
        userService.registerUser(username, encodedPassword);

        // Redirect to login page after successful registration
        return "redirect:/register";
    }
}
