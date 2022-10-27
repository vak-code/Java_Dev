package com.example.demo.largestnumber;

public class LargestNumber {

	private LargestNumberDP dataProvider;
	private int max;
	private int[] inputNumbers;
	
	public int findMax()
	{
		inputNumbers = dataProvider.readArray();
		max = inputNumbers[0];
		for(int i = 1; i < inputNumbers.length ; i++)
		{
			if(max < inputNumbers[i])
				max = inputNumbers[i];
		}
		
		return max;
	}
}
