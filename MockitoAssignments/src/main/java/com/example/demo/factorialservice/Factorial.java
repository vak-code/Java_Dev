package com.example.demo.factorialservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Factorial {

	@Autowired
	private DataProviderFactorial dataProvider;
	
	public int calculatFactorial()
	{
		int input =  dataProvider.readData();
		int result=1;
		input = Math.abs(input);
		for(int i=2 ; i <= input ; i++)
			result *= i;
		
		return result;
	}


}
