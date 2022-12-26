package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	Environment env;
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello From " + env.getProperty("local.server.port");
	}
}
