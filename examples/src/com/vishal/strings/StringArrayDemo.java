package com.vishal.strings;

//String Array Demo
public class StringArrayDemo {
	
	public static void main(String[] a)
	{
		String[] text = {"This","is","a","Test"};
		
		for(String str : text)
			System.out.print(str + " ");
		
		System.out.println();
		
		//Modifying the String
		text[1] = "was";
		text[3] = "test, too";
		
		for(String str : text)
			System.out.print(str + " ");
		
	}

}
