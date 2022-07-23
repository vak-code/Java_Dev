package com.vishal.exception;

//Demonstrates exception scenario
public class ExceptionDemo1 {
	
	public static void main(String[] args)
	{
		int[] nums = new int[4];
		
		try
		{
			System.out.println("Before the exception");
			
			nums[7] = 10;
			
			System.out.println("This won't be printed");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught!");
		}
		
		System.out.println("After the exception");
	}

}
