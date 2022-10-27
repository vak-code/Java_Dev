package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserType;

@RestController
public class UserDIController {

	@Autowired
	@Qualifier("admin")
	UserType userType;
	
	@GetMapping
	public String getUser()
	{
		return userType.getUser();
	}
}
