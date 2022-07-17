package com.vishal.core;

/*
 * This class demonstrates the difference between
 * int and double data types
 */

public class IntDoubleDemo {

	public static void main(String[] args)
	{
		int i; //this declares an int variable
		double d; //this declares a double variable
		
		i = 10; //assign value of 10 to int
		d = 10.0; //assign 10.0 to double
		
		System.out.println("The Original value of int i is : " + i);
		System.out.println("The Original value of double d is : " + d);
		
		//now, divide them by 4
		i = i / 4;
		d = d / 4;
		
		System.out.println("The value after division by 4 of int i is : " + i);
		System.out.println("The value after division by 4 of double d is : " + d);
		
	}
}
