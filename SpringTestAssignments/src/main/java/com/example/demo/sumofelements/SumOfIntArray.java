package com.example.demo.sumofelements;

import org.springframework.stereotype.Service;

@Service
public class SumOfIntArray {

	private int sum=0;
	
	public int getSum(int[] input)
	{
		for(int i = 0; i < input.length ; i++)
			sum += input[i];
		
		return sum;
	}
}
