package com.vishal.more.classobj;

class Test1
{}

class Test2
{}

public class GetClassMethodDemo {

	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		System.out.println("The class of t1 is " + t1.getClass());
		System.out.println("The class of t2 is " + t2.getClass());
	}
}
