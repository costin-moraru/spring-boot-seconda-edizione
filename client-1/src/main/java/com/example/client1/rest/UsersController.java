package com.example.client1.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client1.model.MyUserDetails;
import com.example.client1.security.MyUserDetailsService;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	

	
	@PreAuthorize("hasRole(\"ADMIN\")")
	@GetMapping
	public List<MyUserDetails> findAll() {
		return myUserDetailsService.findAll();
	}
	
	@PreAuthorize("permitAll()")
	@PostMapping
	public MyUserDetails register(@RequestBody() MyUserDetails userDetails) {
		return myUserDetailsService.register(userDetails);
	}

}
