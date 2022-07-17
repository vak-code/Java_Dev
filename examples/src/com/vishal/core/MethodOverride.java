package com.vishal.core;

//This code shows an example of Method Override feature

class A{
	
	int i, j;
	
	A()
	{}
	
	A(int a, int b)
	{
		i = a;
		j = b;
	}
	
	void show()
	{
		System.out.println("The values of I and J are : " + i + " & " + j);
	}
	
}

class B extends A
{
	int k;
	
	B(int a, int b, int c)
	{
		super(a, b);
		k = c;
		
	}
	
	//This overrides the show method of A
	void show()
	{
		System.out.println("The value of K is : " + k);
	}
}
public class MethodOverride {

	public static void main(String[] args)
	{
		B subObj = new B(1,2,3);
		subObj.show(); //this calls the show method of class B and not A
		
		A mainObj = new A(5,6);
		mainObj.show();
		
		mainObj = subObj;
		mainObj.show();
		
		//subObj = mainObj;
	}
}
