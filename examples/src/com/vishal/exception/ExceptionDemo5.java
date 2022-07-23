package com.vishal.exception;

//exception subclasses must precede the super classes
public class ExceptionDemo5 {
	
	public static void main(String[] args)
	{
		int[] numer = {31, 5, 0, 56, 23, 5, 90, 45};
		int[] denom = {31, 5, 0, 56, 23, 5, 90};
		
		for(int i = 0; i < numer.length ; i++)
		{
			try
			{
				System.out.println("Division of " + numer[i] + " by " + denom[i] + " = " + numer[i]/denom[i]);
			}
			catch(Throwable e) 
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Throwable");
			}
		}
	}

}
