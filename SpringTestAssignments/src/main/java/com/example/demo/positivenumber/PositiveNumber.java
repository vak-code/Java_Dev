package com.example.demo.positivenumber;

import org.springframework.stereotype.Service;

@Service
public class PositiveNumber {

	public boolean isPositive(int num)
	{
		if(num >= 0)
			return true;
		else
			return false;
	}
}
