package com.vishal.core;

//This program shows the life cycle of a variable
public class VarInitDemo {

	public static void main(String[] args)
	{
		int x;
		
		for(x = 0; x < 3; x++)
		{
			int y = -1; //This gets initialized each time the block is executed
			
			System.out.println("The value of y at start is : " + y); 
			
			y = 100;
			System.out.println("The value of y now is : " + y);
		}
	}
}
