package com.paymentgatewayapi.Controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentgatewayapi.Entity.PaymentgatewayapiEntity;
import com.paymentgatewayapi.Repository.PaymentgatewayapiRepository;





@RestController
@RequestMapping("/payments")
public class PaymentgatewayapiController {

    private final PaymentgatewayapiRepository paymentRepository;

    public PaymentgatewayapiController(PaymentgatewayapiRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPaymentById(@PathVariable Long id) {
        Optional<PaymentgatewayapiEntity> payment = paymentRepository.findById(id);
        return payment.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createPayment(@RequestBody PaymentgatewayapiEntity payment) {
        PaymentgatewayapiEntity newPayment = paymentRepository.save(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPayment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePayment(@PathVariable Long id, @RequestBody PaymentgatewayapiEntity updatedPayment) {
        Optional<PaymentgatewayapiEntity> paymentOptional = paymentRepository.findById(id);
        if (paymentOptional.isPresent()) {
            updatedPayment.setId(id);
            PaymentgatewayapiEntity savedPayment = paymentRepository.save(updatedPayment);
            return ResponseEntity.ok(savedPayment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePayment(@PathVariable Long id) {
        Optional<PaymentgatewayapiEntity> payment = paymentRepository.findById(id);
        if (payment.isPresent()) {
            paymentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}