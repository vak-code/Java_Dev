package com.vishal.exception;

//handle the exception gracefully and continue the flow
public class ExceptionDemo3 {
	
	public static void main(String[] args)
	{
		int[] numer = {2 ,4 ,8, 16, 32, 64};
		int[] denom = {2, 3, 0, 5, 0, 1};
		
		for(int i=0; i < numer.length ; i++)
		{
			try 
			{
				System.out.println("Division of  " + numer[i] + "/" + denom[i] + " = " + numer[i] / denom[i]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero error " + numer[i] + "/" + denom[i]);
			}
			
		}
	}

}
