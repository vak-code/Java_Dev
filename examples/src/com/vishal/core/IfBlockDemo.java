package com.vishal.core;

public class IfBlockDemo {
//This class is demo of a code of block
	public static void main(String[] args)
	{
		double i,j,d;
		
		i=5;
		j=10;
		
		//Below IF block contains a block of code
		if(i!=0)
		{
			System.out.println("The value of i != 0 and hence inside the IF block");
			d=j/i;
			System.out.println("the value of i/j = "+d);
		}
	}
}
