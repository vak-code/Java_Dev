package com.example.demo.balancezero;

import org.springframework.stereotype.Service;

@Service
public class ZeroBalanceService {

	public boolean isBalZero(double balance)
	{
		if(balance == 0.0)
			return true;
		else
			return false;
	}
}
