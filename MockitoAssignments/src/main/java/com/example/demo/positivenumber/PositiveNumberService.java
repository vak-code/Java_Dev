package com.example.demo.positivenumber;

import org.springframework.stereotype.Service;

@Service
public class PositiveNumberService {

	private PositiveNumberDP dataProvider;
	
	public boolean isPositive()
	{
		int num = dataProvider.readNum();
		
		if(num >= 0)
			return true;
		
		else
			return false;
	}
}
