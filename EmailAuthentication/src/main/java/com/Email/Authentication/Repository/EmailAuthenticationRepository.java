package com.Email.Authentication.Repository;

import com.Email.Authentication.Entity.EmailAuthenticationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailAuthenticationRepository extends JpaRepository<EmailAuthenticationEntity, Long> {
    EmailAuthenticationEntity findByEmail(String email);
    // Other custom queries if needed
}
