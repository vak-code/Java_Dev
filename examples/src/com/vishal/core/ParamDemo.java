package com.vishal.core;

//Simple example showing parameter example

class ChkNum
{
	//This function check whether the number is even or not
	boolean isEven(int a)
	{
	if((a % 2) == 0)
		return true;
	else
		return false;
	}
}

public class ParamDemo {

	public static void main(String[] args)
	{
		ChkNum CN = new ChkNum();
		
		//calling the isEven function by passing diff numbs
		if(CN.isEven(10))
			System.out.println("10 is even number");
		
		if(CN.isEven(11))
			System.out.println("11 is even number");

		if(CN.isEven(12))
			System.out.println("12 is even number");

	}
}
