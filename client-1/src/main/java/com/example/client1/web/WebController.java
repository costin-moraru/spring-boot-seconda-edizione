package com.example.client1.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	
	@GetMapping("/user")
	@PreAuthorize("hasRole(\"USER\")")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole(\"ADMIN\")")
	public String admin() {
		return "admin";
	}

}
