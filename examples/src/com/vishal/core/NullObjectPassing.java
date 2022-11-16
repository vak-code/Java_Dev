package com.vishal.core;

public class NullObjectPassing {

	public static void test(Object o)
	{
		System.out.println("Object called");
	}
	
	public static void test(String s)
	{
		System.out.println("String called");
	}
	
	public static void main(String[] args) {
		
		test(null);
		String s = null;
	}
}

