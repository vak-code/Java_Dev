package com.example.demo.evennumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenNumberService {

	@Autowired
	private EvenNumberDP dataProvider;
	
	public boolean isEven()
	{
		int num = dataProvider.readNumber();
		
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
}
