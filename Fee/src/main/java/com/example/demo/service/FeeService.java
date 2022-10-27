package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fee;

@Service
public class FeeService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Fee getFeeSrvc() {
		//return "GET FEE from Service";
		return new Fee("LateFee",10.00);
	}

	public String postFeeSrvc() {
		return postMsg;
	}

	public String putFeeSrvc() {
		return env.getProperty("putMsg");
	}

	public String delFeeSrvc() {
		return env.getProperty("delMsg");
	}

}
