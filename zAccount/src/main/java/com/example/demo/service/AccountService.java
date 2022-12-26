package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;

@Service
public class AccountService {

	@Value("${getAccount}")
	String getAccount;
	
	
	public Account getAccountService() {
		return new Account(100,"Wilson");
	}

}
