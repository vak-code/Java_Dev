package com.vishal.exception;

//Using Mutli catch demo for Java7 and above
public class MultiCatchDemo {
	
	public static void main(String[] args)
	{
		int a = 20, b = 0;
		int res;
		char[] ch = {'A', 'B', 'C'};
		
		for(int i = 0; i < 2; i++)
		{
			try 
			{
				if(i == 0)
					res = a / b; //throws divide by 0 exception
				else
					ch[5] = 'F'; //throws ArrayIndexOutOfBoundsException
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Caught multi catch exception : " + e.getMessage());
			}
		}
	}

}
