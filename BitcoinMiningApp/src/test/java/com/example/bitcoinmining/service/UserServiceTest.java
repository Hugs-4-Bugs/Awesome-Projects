package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("testpassword");
        User savedUser = userService.registerUser(user);

        assertNotNull(savedUser.getId());
        assertEquals("testuser", savedUser.getUsername());
        // Add more assertions as needed
    }

    // Add more test methods for UserService
}
