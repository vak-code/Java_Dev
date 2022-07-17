package com.vishal.core;

//This program demonstrates constructor overloading

class MyClass1
{
	int x;
	
	//default constructor
	MyClass1()
	{
		System.out.println("Inside MyClass1()");
		x = 0;
	}
	
	MyClass1(int a)
	{
		System.out.println("Inside MyClass1(int a)");
		x = a;		
	}
	
	MyClass1(double d)
	{
		System.out.println("Inside MyClass1(double d)");
		x = (int) d;

	}
	
	MyClass1(int a, int b)
	{
		System.out.println("Inside MyClass1(int a, intb)");
		x = a * b;

	}
}

public class OverloadConsDemo {

	public static void main(String[] args)
	{
		MyClass1 mc1 = new MyClass1();
		MyClass1 mc2 = new MyClass1(15);
		MyClass1 mc3 = new MyClass1(27.15);
		MyClass1 mc4 = new MyClass1(10,20);
		
		System.out.println("mc1.x = " + mc1.x);
		System.out.println("mc2.x = " + mc2.x);
		System.out.println("mc3.x = " + mc3.x);
		System.out.println("mc4.x = " + mc4.x);
	}
}
