package com.example.demo.accountbalance;

import org.springframework.stereotype.Service;

@Service
public class AccountBalance {

	public boolean isBalanceValid(double balance)
	{
		if(balance >= 1000)
			return true;
		else
			return false;
	}
}
