package com.example.java.login.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.java.login.Entity.User;
import com.example.java.login.Repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= repo.findByEmail(username);
		
		if (user==null) {
			throw new UsernameNotFoundException("No user for the given email");
		}
	return new CustomUserDetails(user);
	}
	
}
