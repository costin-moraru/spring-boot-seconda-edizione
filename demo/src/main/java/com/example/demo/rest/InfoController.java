package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class InfoController {
	
	@GetMapping
	public String info() {
		return "Server";
	}
	
	@PostMapping
	public void printConsole() {
		System.out.println("Hello console");
	}

}
