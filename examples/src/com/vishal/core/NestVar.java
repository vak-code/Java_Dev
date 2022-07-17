package com.vishal.core;

/*
 * This program demonstrates the working of variable scopes
 * We cannot create a variable with same name inside inner block as in outer block
 * This program fails in compilation
 */
public class NestVar {

	public static void main(String[] args)
	{
		int count;
		
		for(count = 0; count < 10; count++)
		{
			System.out.println("The value of count is : " + count);
			
			int count; // this is illegal
			for(count = 0; count < 2; count++)
				System.out.println("The value of count is : " + count);
		}
	}
}
