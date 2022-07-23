package com.vishal.exception;

//manually throwing exception
public class ThrowException {
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Before throwing the excepton");
			throw new ArithmeticException();
			System.out.println("this wont b printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cought the excepton : " + e.getMessage());
		}
		
		System.out.println("After throwing the excepton");
	}
}
