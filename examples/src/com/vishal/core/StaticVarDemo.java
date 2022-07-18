package com.vishal.core;

class StaticDemo
{
	int x;
	static int y;
	
	int sum()
	{
		return (x+y);
	}
}

public class StaticVarDemo {

	public static void main(String[] args)
	{
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();
		
		//Instance variable are specific to each object
		sd1.x = 10;
		sd2.x = 20;
		
		System.out.println("The variables sd1.x and "
				+ " sd2.x are different");
		System.out.println("The value of sd1.x = " + sd1.x +
				"and value of sd2.x = " + sd2.x);
		
		//The static variable is shared with each object
		StaticDemo.y = 19;
		System.out.println("The value of StaticDemo.y = " + StaticDemo.y);
		System.out.println("The value of sd1.sum = " + sd1.sum());
		System.out.println("The value of sd2.sum = " + sd2.sum());
		
		StaticDemo.y = 100;
		System.out.println("The value of StaticDemo.y = " + StaticDemo.y);
		System.out.println("The value of sd1.sum = " + sd1.sum());
		System.out.println("The value of sd2.sum = " + sd2.sum());
		
	}
}
