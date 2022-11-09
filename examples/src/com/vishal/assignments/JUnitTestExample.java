package com.vishal.assignments;

//simple JUnit Demo	
public class JUnitTestExample {

	//create a class that has function which returns the length of the String
	
	public int lengthOf(String input)
	{
		int result = 0;
		
		if(input != null)
		{
			for(int i=0; i<input.length(); i++)
			{
				result++;
			}
		}
		else 
			return result;
		System.out.println("Length = " + result);
		return result;
	}
}
