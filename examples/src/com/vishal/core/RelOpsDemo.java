package com.vishal.core;

//This program demonstrates the relational and logical operators
public class RelOpsDemo {
	
	public static void main(String[] args)
	{
		int i, j;
		boolean a, b;
		
		i = 10;
		j = 11;
		
		if(i < j)
			System.out.println("i < j is true");
		
		if(i <= j)
			System.out.println("i <= j is true");
		
		if(i != j)
			System.out.println("i != j is true");
		
		if(i == j)
			System.out.println("This won't be executed");
		
		if(i >= j)
			System.out.println("This also won't execute");
		
		if(i > j)
			System.out.println("And this also won't execute");
		
		a = true;
		b = false;
		
		if(a & b)
			System.out.println("This won't be execute");
		
		if(!(a & b))
			System.out.println("This will be executed !( a & b)");
		
		if(a | b)
			System.out.println("This will be executed ( a | b)");
		
		if(a ^ b)
			System.out.println("The a ^ b is true");
			
	}

}
