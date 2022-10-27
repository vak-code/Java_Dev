package com.example.demo.reversenumber;

import org.springframework.stereotype.Service;

@Service
public class ReverseNumber {

	int result, tempI;
	String tempS="";
	
	public String revNum(int input)
	{
		while(input / 10 >= 1)
		{
			tempI = input % 10;
			input -= tempI;
			input /= 10;
			tempS += tempI;
		}
		tempS += input;
		return tempS;
	}
}
