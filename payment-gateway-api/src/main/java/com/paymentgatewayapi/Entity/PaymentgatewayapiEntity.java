package com.paymentgatewayapi.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "payments")
public class PaymentgatewayapiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define other fields for the payment entity
    private String paymentMethod;
    private double amount;

    // Constructors, getters, and setters

    public PaymentgatewayapiEntity() {
    }

    public PaymentgatewayapiEntity(Long id, String paymentMethod, double amount) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // Getter and Setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Additional fields and methods as needed
    
    public PaymentgatewayapiEntity(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

}
