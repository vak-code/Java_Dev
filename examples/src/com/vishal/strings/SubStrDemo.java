package com.vishal.strings;

//using sub string of string
public class SubStrDemo {
	
	public static void main(String[] agrs)
	{
		String orgStr = "Java makes the web move!";
		
		//creating a substring from original string
		String subStr = orgStr.substring(5, 18);
		
		System.out.println("Original String : " + orgStr);
		System.out.println("Sub String is : " + subStr);
	}

}
