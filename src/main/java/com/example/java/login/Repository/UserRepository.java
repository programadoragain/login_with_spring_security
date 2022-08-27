package com.example.java.login.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.java.login.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
