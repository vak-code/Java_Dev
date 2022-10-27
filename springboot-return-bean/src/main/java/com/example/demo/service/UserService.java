package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {

	public User getUser() {
		return new User("Vishal", "Premium");
	}

}
