package com.example.demo.smallestnumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindSmallest {

	@Autowired
	private FindSmallestDP dataProvider;
	private int smallest;
	private int[] inputNumbers;
	
	public int findSmallest()
	{
		inputNumbers = dataProvider.readArray();
		
		smallest = inputNumbers[0];
		
		for(int i = 0; i < inputNumbers.length ; i++)
		{
			if(smallest >= inputNumbers[i])
				smallest = inputNumbers[i];
		}
		
		return smallest;
	}
}
