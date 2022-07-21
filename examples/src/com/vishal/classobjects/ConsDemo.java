package com.vishal.classobjects;

//a Simple constructor demo

class MyClass{
	
	int x;
	
	MyClass(){
		
		this.x = 10;
	}
}

public class ConsDemo {

	public static void main(String[] args)
	{
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		
		System.out.println(m1.x + " " + m2.x);
	}
}
