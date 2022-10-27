package com.example.demo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.Account;

//@Primary
//@Component
public class SavingsAccount implements Account {

	@Override
	public String getAcctType() {
		return "Savings Account";
	}

}
