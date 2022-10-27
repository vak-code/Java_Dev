package com.example.demo.maxoftwo;

import org.springframework.stereotype.Service;

@Service
public class MaxOfTwo {

	public int findMax(int num1, int num2)
	{
		if(num1 > num2)
			return num1;
		else 
			return num2;
	}
}
