package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public User getUser() {
		
		return new User(123,"UserName");
	}

	public String postUser() {
		
		return postMsg;
	}

	public String putUser() {
		
		return env.getProperty("putMsg");
	}

	public String deleteUser() {
		
		return env.getProperty("delMsg");
	}
	
	

}
