package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustService {

	@Value("${getMsg}")
	String getMsg;
	
	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Customer getCustService() {
		//return getMsg;
		return new Customer("James","Bond");
	}

	public String postCustService() {
		return postMsg;
	}

	public String putCustService() {
		return env.getProperty("putMsg");
	}

	public String delCustService() {
		return null;
	}

}
