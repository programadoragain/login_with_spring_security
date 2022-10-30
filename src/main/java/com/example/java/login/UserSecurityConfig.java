package com.example.java.login;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Order(1)
public class UserSecurityConfig {
		
	@Bean
	public SecurityFilterChain configureFilterChainUser(HttpSecurity http) throws Exception {
					
		http.antMatcher("/user/**").authorizeRequests().anyRequest().hasRole("USER")
			.and()
			.formLogin()
				.loginPage("/user/login")
				.usernameParameter("email")
				.loginProcessingUrl("/user/login")
				.defaultSuccessUrl("/user/home")
			.permitAll();
				
		return http.build();
	}
		
}
