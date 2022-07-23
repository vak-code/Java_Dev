package com.vishal.exception;
//let JVM handle the exception
public class ExceptionNotHandled {
	
	public static void main(String[] args)
	{
		int[] nums = new int[4];
		
		System.out.println("Before throwing the exception");
		
		nums[7] = 10;
	}

}
