package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.User;
import com.example.bitcoinmining.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerUser(User user) {
        // Implement user registration logic
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("Username is already taken");
        }
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        return userRepository.save(user);
    }

    @Override
    public void registerUser(String username, String encodedPassword) {
        throw new UnsupportedOperationException("This method is not supported for direct user registration");
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        // Find the user by username
        User user = userRepository.findByUsername(username);
        
        // Check if the user exists and the provided password matches
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }

    // Implement other methods for user management (update, delete, etc.)
}
