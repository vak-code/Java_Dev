package com.vishal.core;

//this class demonstrates Modulus operator
public class ModDemo {

	public static void main(String[] args)
	{
		int ires, irem;
		double dres, drem;
		
		ires = 10 / 3; //int division operation
		irem = 10 % 3; // int modulus operator
		
		dres = 10.0 / 3.0; //double devision operation
		drem = 10.0 % 3.0; //double modulus operation
		
		System.out.println("The Result and Remainder of 10 / 3 are : " + ires + " & " + irem);
		System.out.println("The Result and Remainder of 10.0 / 3.0 are : " + dres + " & " + drem);
	}
}
