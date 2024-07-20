package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.Entity.User; // Import your custom User entity class

import com.jpa.test.Repository.UserRepository;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Prabhat Kumar");
		user.setCity("Bangalore");
		user.setStatus("Java Developer");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
	}

}


