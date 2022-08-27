package com.example.java.login.Entity;

import javax.persistence.*;

import com.example.java.login.Roles;

@Entity
@Table(name= "users")
public class User {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(unique= true, nullable= false, length= 40)
	private String email;
	@Column(nullable= false, length= 15)
	private String password;
	@Enumerated(EnumType.STRING)
	private Roles role;
	
	public User () {}
	
	public User(String email, String password, Roles role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}

	
}


