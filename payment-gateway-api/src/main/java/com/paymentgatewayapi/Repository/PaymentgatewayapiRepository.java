package com.paymentgatewayapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentgatewayapi.Entity.PaymentgatewayapiEntity;

@Repository
public interface PaymentgatewayapiRepository extends JpaRepository<PaymentgatewayapiEntity, Long> {
    // Custom queries or methods can be defined here if needed
}
