package com.vishal.interfaces;

@FunctionalInterface
interface Square
{
	int calculateSquare(int num);
}

public class FunctionalInterfaceDemo {

	public static void main(String [] rargs)
	{
		//Using Lambda Expression creating an instance of the interface
		Square squareObj = (int num) -> num * num;
		System.out.println("Squarre of 10 is : " + squareObj.calculateSquare(10));
	}

	
}
