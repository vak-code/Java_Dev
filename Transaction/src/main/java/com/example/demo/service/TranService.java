package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;

@Service
public class TranService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Transaction getServ() {
		return new Transaction(1234,1434.3,"10-aug-22");
	}

	public String postServ() {
		return postMsg;
	}

	public String putServ() {
		return env.getProperty("putMsg");
	}

	public String delServ() {
		return env.getProperty("delMsg");
	}

}
