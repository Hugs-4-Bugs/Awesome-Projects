package com.Email.Authentication;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Email.Authentication", "com.Email.Authentication.Controller", "com.Email.Authentication.Repository", "com.Email.Authentication.Entity"})
public class EmailAuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailAuthenticationApplication.class, args);
    }
}

//
//@SpringBootApplication
//public class EmailAuthenticationApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(EmailAuthenticationApplication.class, args);
//    }
//}
