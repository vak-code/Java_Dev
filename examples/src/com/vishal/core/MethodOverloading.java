package com.vishal.core;
//this program demonstrates the method overloading example
public class MethodOverloading {

	void ovldMethod()
	{
		System.out.println("No parameters");
	}
	
	//overload olvdMethod with one parameter
	void ovldMethod(int a)
	{
		System.out.println("One int parameter : " + a);
	}
	
	//overload olvdMethod with 2 in parameter
	int ovldMethod(int a, int b)
	{
		System.out.println("Two int parameters : a = " + a + ", b = " + b);
		return (a + b);
	}
	
	//overload olvdMethod with 2 double parameter
	double ovldMethod(double a, double b)
	{
		System.out.println("Two double parameters : a = " + a + ", b = " + b);
		return (a + b);
	}
	
	public static void main(String[] args)
	{
		int ires;
		double dres;
		MethodOverloading MO = new MethodOverloading();
		
		//calling overloading methods
		MO.ovldMethod();
		System.out.println();
		
		MO.ovldMethod(10);
		System.out.println();
		
		ires = MO.ovldMethod(10, 20);
		System.out.println();
		System.out.println("The ires = " + ires);
		
		dres = MO.ovldMethod(10.0, 10.0);
		System.out.println();
		System.out.println("The dres = " + dres);
	}
	
}
