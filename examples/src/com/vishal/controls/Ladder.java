package com.vishal.controls;

//This shows IF - ELSE IF ladder
public class Ladder {
	
	public static void main(String[] args)
	{
		int x;
		
		for(x = 0; x < 6 ; x++)
		{
			if(x == 1)
				System.out.println("x is 1");
			else if(x == 2)
				System.out.println("x is 2");
			else if(x == 3)
				System.out.println("x is 3");
			else if(x == 4)
				System.out.println("x is 4");
			else
				System.out.println("x is not between 1 and 4");
		}
	}

}
