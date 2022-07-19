package com.vishal.controls;

//This is example of IF block
public class IfDemo {
	
	public static void main(String[] args)
	{
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if(a <= b)
			System.out.println("a is less than b");
		
		if(a == b)
			System.out.println("This won't be printed");
		
		System.out.println();
		
		c = a - b; // c contains -1
		
		if(c >= 0)
			System.out.println("c is non-negative");
		if(c < 0)
			System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a; // now, c contains 1
		
		if(c >= 0)
			System.out.println("c is non-negative");
		if(c < 0)
			System.out.println("c is negative");
		
	}

}
