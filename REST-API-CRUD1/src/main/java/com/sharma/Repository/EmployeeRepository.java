package com.sharma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sharma.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    // No need to define save method here unless you have a custom implementation
}
