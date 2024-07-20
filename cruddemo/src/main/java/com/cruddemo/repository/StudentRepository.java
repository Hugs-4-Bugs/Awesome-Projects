package com.cruddemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
