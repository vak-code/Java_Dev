package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.Account;

@Qualifier("current")
@Component
public class CurrentAccount implements Account {

	@Override
	public String getAcctType() {
		return "Current Account";
	}

}
