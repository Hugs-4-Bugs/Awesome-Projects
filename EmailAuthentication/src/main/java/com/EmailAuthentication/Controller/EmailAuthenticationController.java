package com.EmailAuthentication.Controller;

import com.Email.Authentication.Entity.EmailAuthenticationEntity;
import com.Email.Authentication.Repository.EmailAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/EmailAuth")
public class EmailAuthenticationController {

    @Autowired
    private EmailAuthenticationRepository repository;

    @GetMapping("/users/{email}")
    public ResponseEntity<EmailAuthenticationEntity> getUserByEmail(@PathVariable String email) {
        EmailAuthenticationEntity user = repository.findByEmail(email);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

//    @PostMapping("/users")
//    public ResponseEntity<EmailAuthenticationEntity> createUser(@RequestBody EmailAuthenticationEntity user) {
//        try {
//            EmailAuthenticationEntity newUser = repository.save(user);
//            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }
//    
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody EmailAuthenticationEntity user) {
        try {
            // Check if the provided email already exists
            EmailAuthenticationEntity existingUser = repository.findByEmail(user.getEmail());
            if (existingUser != null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("User with email '" + user.getEmail() + "' already exists");
            }

            // Save the new user
            EmailAuthenticationEntity newUser = repository.save(user);
            String successMessage = "User created with email: " + newUser.getEmail();
            return ResponseEntity.status(HttpStatus.CREATED).body(successMessage);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid data or duplicate entry: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred: " + e.getMessage());
        }
    }


    @PutMapping("/users/{id}")
    public ResponseEntity<EmailAuthenticationEntity> updateUser(
            @PathVariable Long id, @RequestBody EmailAuthenticationEntity updatedUser) {
        Optional<EmailAuthenticationEntity> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        EmailAuthenticationEntity existingUser = optionalUser.get();
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setOtp(updatedUser.getOtp());

        repository.save(existingUser);
        return ResponseEntity.ok(existingUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<EmailAuthenticationEntity>> getAllUsers() {
        List<EmailAuthenticationEntity> users = repository.findAll();
        return ResponseEntity.ok(users);
    }
}
