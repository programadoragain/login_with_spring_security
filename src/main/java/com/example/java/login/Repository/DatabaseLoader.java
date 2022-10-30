package com.example.java.login.Repository;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.java.login.Roles;
import com.example.java.login.Entity.User;

public class DatabaseLoader {
	private UserRepository repo;

	public DatabaseLoader(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	@Bean
	public CommandLineRunner initializeDatabase() {
		return args -> {
			User user1= new User("admin@admin.com", "123", Roles.ADMIN);
			User user2= new User("user@user.com", "123", Roles.USER);
			
			repo.saveAll(List.of(user1, user2));
		
			System.out.println("Base de datos inicializada");
			};
	}
	
}
