package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		Student s = new Student();
		s.setName("mike");
		s.setCourse("java development course");
		s.setFee(20000);
		studentRepo.save(s);
	}
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(1);
	}
	@Test
	void getStudentInfo() {
		Optional<Student> findById= studentRepo.findById(2);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
		
		}
	@Test
	void upadteStudent(){
        Student s = new Student();
		s.setId(2);
		s.setName("mike tyson");
		s.setCourse("java development course with project");
		s.setFee(20000);
		studentRepo.save(s);
	}
}
