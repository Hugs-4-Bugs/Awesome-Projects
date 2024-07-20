package com.jpa.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String city;
	private String status;
	
	
//	Getters and setters allow control over the values.
//	In Java, Getter and Setter are methods used to protect your data and make your code more secure. 
//	Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
//	Parameterized constructors are used to create user instances of objects with user defined states.
	public User(int id, String name, String city, String status) {   // Parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	
	
//	We use default constructor because spring needs to be able to create an instance of your class
//	and set the variables via reflection or setters.
	
	public User() {    // Default Constructor
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	// A toString() is an in-built method in Java that returns the value given to it in string format.
   //  Hence, any object that this method is applied on, will then be returned as a string object.
	
	@Override
	public String toString() {       
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
	
	
	

}
