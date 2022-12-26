package com.vishal.exception;

public class ExceptionPropagationDemo {

	public static void main(String[] args) {
		ExceptionPropagationDemo demoObj = new ExceptionPropagationDemo();
		
		System.out.println("Inside the Main method");
		demoObj.first();
	}
	
	public void first()
	{
		System.out.println("Inide the method A");
		second();
	}

	
	public void second()
	{
		System.out.println("Inside method B");
		System.out.println("Inside method B");
		throw new NullPointerException();
	}
}
