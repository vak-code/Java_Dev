package com.vishal.exception;

//Creating  a custom exception

class NonIntException extends Exception
{
	int n, d;
	
	NonIntException(int i, int j)
	{
		n = i;
		d = j;
	}
	
	public String toString()
	{
		return n + " / " + d + " results into non-integer";
	}
}

public class CustomException {

	public static void main(String[] args)
	{
		int[] numer = {2, 4, 8, 15, 32, 64, 127, 256};
		int[] denom = {2, 4, 0, 56, 23, 5, 90};
		
		for(int i = 0; i < numer.length ; i++)
		{
			try
			{
				if(numer[i] % 2 != 0)
					throw new NonIntException(numer[i], denom[i]);
				
				System.out.println("Division of " + numer[i] + " by " + denom[i] + " = " + numer[i]/denom[i]);
			}
			catch(ArithmeticException e) 
			{
				System.out.println("ArithmeticException");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			catch(NonIntException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("At the end");
	}
}
