package com.sharma.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.Entity.EmployeeEntity;
import com.sharma.Repository.EmployeeRepository;



@RestController // Define a class as Controller class
@RequestMapping("/api") // Used to map request  to a method  in controller layer/class
public class EmployeeController {
	
	
	@Autowired //used to inject the bean OR for automatic Dependency Injection
	EmployeeRepository employeeRepository;
	
	
	@PostMapping("/employee")
	public String createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return "Employee Created in Database.";
	}
		

}

