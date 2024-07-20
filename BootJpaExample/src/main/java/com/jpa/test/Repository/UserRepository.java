package com.jpa.test.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
			org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

}
