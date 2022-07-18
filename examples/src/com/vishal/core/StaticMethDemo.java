package com.vishal.core;

//using static variables and methods

class StaticMeth
{
	static int val = 10;
	
	static int valDenom()
	{
		return (val / 2);
	}
}

public class StaticMethDemo {

	public static void main(String[] rgs)
	{
		System.out.println("The value of StaticMeth.val = " + StaticMeth.val);
		System.out.println("The value of StaticMeth.valDenom = " + StaticMeth.valDenom());
		
		StaticMeth.val = 20;
		System.out.println("The value of StaticMeth.val = " + StaticMeth.val);
		System.out.println("The value of StaticMeth.valDenom = " + StaticMeth.valDenom());

	}
}
