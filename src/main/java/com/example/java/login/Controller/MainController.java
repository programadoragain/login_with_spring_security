package com.example.java.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
	
	@GetMapping ("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping ("/admin/login")
	public String adminLoginPage() {
		return "admin/admin_login";
	}
	
	@GetMapping ("/user/login")
	public String userLoginPage() {
		return "user/user_login";
	}
	
	@GetMapping("/admin/home")
	public String viewAdminHome() {
		return "admin/admin_home";
	}
	
	@GetMapping ("/user/home") 
	public String viewUserHome() {
		return "user/user_home";
	}


}


