package com.example.bitcoinmining.repository;

import com.example.bitcoinmining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	User save(User user);
}
