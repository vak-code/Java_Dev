package com.example.demo.largestofintarray;

import org.springframework.stereotype.Service;

@Service
public class LargestFromIntArray {

	private int result=0;
	
	public int findLargest(int[] inputIntArray)
	{
		result = inputIntArray[0];
		for(int i = 1; i < inputIntArray.length ; i++)
		{
			if(result < inputIntArray[i])
				result = inputIntArray[i];
		}
		
		return result;
			
	}
}
