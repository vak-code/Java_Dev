package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
 @Autowired
 Configuration configuration;
 
	@GetMapping("/greet")
	public String greet() {
		return "Environment is " + configuration.getName();
	}

}