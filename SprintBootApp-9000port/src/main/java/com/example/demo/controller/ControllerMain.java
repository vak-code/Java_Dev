package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {
	
	@Autowired
	Environment env;
	
	@GetMapping
	public String getMethod()
	{
		return env.getProperty("local.server.port");
	}
	

}
