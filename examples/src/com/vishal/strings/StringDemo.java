package com.vishal.strings;

//Introducing Strings in Java
public class StringDemo {
	
	public static void main(String[] args)
	{
		//Initializing Strings in different ways
		String str1 = new String("Java Strings are objects");
		String str2 = "The Strings can be initialized in different ways in Java";
		String str3 = new String(str2);
		String str4 = str1;
		
		str1 = str2;
		str2 = str4 + "This is not allowed"; 
		str3 = new String("This is not allowed as well");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
