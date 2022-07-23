package com.vishal.exception;

//Exception thrown by one method can be caught in another

class Test
{
	static void test()
	{
		int[] nums = new int[4];
				
		System.out.println("Before exception is thrown");
		
		nums[7] = 10;
		
		System.out.println("Flow won't come here");
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args)
	{
		try 
		{
			Test.test();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" exception is thrown");
		}
		
		System.out.println("After exception is thrown");
	}
	
}
