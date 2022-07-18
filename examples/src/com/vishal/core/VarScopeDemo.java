package com.vishal.core;

//This program shows variable scope demo
public class VarScopeDemo {
	
	public static void main(String[] atgs)
	{
		int x = 10;
		
		if(x == 10)
		{
			int y = 20;
			
			System.out.println("The values of x and y are :" + x +" & " + y);
			
			x = y * 2;
		}
		
		//y = 100; //this line fails as y is not known in this context
		
		System.out.println("The value of x is : " + x);
	}

}
