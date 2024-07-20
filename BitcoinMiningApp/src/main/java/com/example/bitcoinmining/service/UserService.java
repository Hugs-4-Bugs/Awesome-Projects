//package com.example.bitcoinmining.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.example.bitcoinmining.model.User;
//import com.example.bitcoinmining.repository.UserRepository;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
////    public boolean authenticateUser(String username, String password) {
////        // Find the user by username
////        Optional<User> optionalUser = userRepository.findByUsername(username);
////        
////        // Check if the user exists and the provided password matches
////        if (optionalUser.isPresent()) {
////            User user = optionalUser.get();
////            return passwordEncoder.matches(password, user.getPassword());
////        } else {
////            return false; // User does not exist
////        }
////    }
////    
//    
//    public boolean authenticateUser(String username, String password) {
//        // Find the user by username
//        Optional<User> optionalUser = Optional.ofNullable(userRepository.findByUsername(username));
//        
//        // Check if the user exists and the provided password matches
//        return optionalUser.map(user -> passwordEncoder.matches(password, user.getPassword()))
//                            .orElse(false); // Return false if user does not exist
//    }
//
//	public void registerUser(String username, String encodedPassword) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public User registerUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//    // Other methods for user management...
//}





package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.User;

public interface UserService {

    User registerUser(User user);

    void registerUser(String username, String encodedPassword);

	boolean authenticateUser(String username, String password);

    // Add other methods for user management (login, update, delete, etc.)
}
