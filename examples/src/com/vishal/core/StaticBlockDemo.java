package com.vishal.core;

//This program shows an example of static block and its execution

class StaticClass
{
	static double sqrtOf2, sqrtOf3;
	
	static
	{
		System.out.println("This is from static block");
		
		sqrtOf2 = Math.sqrt(2.0);
		sqrtOf3 = Math.sqrt(3.0);
	}
	
	StaticClass(String msg)
	{
		System.out.println(msg);
	}
}
public class StaticBlockDemo {
	
	public static void main(String[] args)
	{
		StaticClass SC= new StaticClass("This is input to Constructor");
		
		System.out.println("Sqrt of 2.0 : " + StaticClass.sqrtOf2);
		System.out.println("Sqrt of 3.0 : " + StaticClass.sqrtOf3);
	}

}
