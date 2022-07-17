package com.vishal.core;

//This class demonstrates Explicit Casting in Java
public class CastDemo {
	public static void main(String[] args)
	{
		double c, d;
		int i;
		byte b;
		char ch;
		
		c=10.0;
		d=5.0;
		
		i = (int) (c/d);
		
		System.out.println("The Int value of c / d ("+c+"/"+d+") : "+i);
		
		i = 256;
		b = (byte) i;
		System.out.println("b is :"+b);
		
		i = 257;
		b = (byte) i;
		System.out.println("b is :"+b);
		
		b = 88; //ACSII of X
		ch = (char) b;
		System.out.println("The ASCII of "+b+" is : "+ch);
	}
}
