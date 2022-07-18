package com.vishal.core;

//passing variable arguments to function demo
public class VarArgsDemo {

	static void varTest(int... v)
	{
		System.out.println("The length of variable argument is : " + v.length);
		System.out.println("The Contents are : ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println("arg " + i +" is : " + v[i]);
	}
	
	public static void main(String[] args)
	{
		varTest(10);
		varTest(1,2,3);
		varTest();
	}
	
}
