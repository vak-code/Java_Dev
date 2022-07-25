package com.vishal.more.classobj;

//shows an example to override the toString method of Object class

class MyClass
{
	//overriding the toString method of Object
	@Override
	public String toString()
	{
		return "MyObject";
	}
}

public class OverrideToStringMethod {

	public static void main(String[] args) {
		
		//creating instance of the class above
		MyClass obj = new MyClass();
		
		//printing the object which should call toString internally
		System.out.println(obj);
	}
}
