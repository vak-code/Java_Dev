package com.example.demo.lenghtofarray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindLength {

	@Autowired
	private FindLengthDP dataProvider;
	private int length;
	private int[] numbers;
	
	public int findLength()
	{
		numbers = dataProvider.readNumbers();
		length = numbers.length;
		
		return length;
	}
	
	
}
