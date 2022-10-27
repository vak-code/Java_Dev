package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Account;

@RestController
public class DIController {

	//@Autowired
	//@Qualifier("current")
	Account currentAcct;
	
	//@Autowired
	Account savingsAcct;
	
	
	@GetMapping
	public String getAcctType()
	{
		return currentAcct.getAcctType();
//		return new SavingsAccount().getAcctType();
	}
}
