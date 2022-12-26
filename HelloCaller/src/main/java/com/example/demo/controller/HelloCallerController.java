package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCallerController {

	@Autowired
	HelloProxy helloProxy;
	
	@GetMapping("/hello")
	public String callHello()
	{
		return helloProxy.getHello();
	}
}
