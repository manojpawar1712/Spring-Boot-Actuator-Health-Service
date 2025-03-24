package com.example.springbootaactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String Hello() {
		return "Hello, Spring boot with actuator!";
	}
	
}
