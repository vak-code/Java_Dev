package com.vishal.exception;

//using multiple catch statements
public class ExceptionDemo4 {
	
	public static void main(String[] args)
	{
		int[] numer = {31, 5, 0, 56, 23, 5, 90, 45};
		int[] denom = {31, 5, 0, 56, 23, 5, 90};
		
		for(int i = 0; i < numer.length; i++)
		{
			try
			{
				System.out.println("Division of " + numer[i] + " by " + denom[i] + " = " + numer[i]/denom[i]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero error");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array idex out of bounds");
			}

		}
	}

}
