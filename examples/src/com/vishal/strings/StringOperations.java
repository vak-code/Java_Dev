package com.vishal.strings;

//demonstrates various String Operations
public class StringOperations {
	
	public static void main(String[] args)
	{
		final String str1 = "Java is number 1 for web developement";
		String str2 = str1;
		String str3 = "Java is powerful in String";
		
		int res, index;
		char ch;
		
		System.out.println("The length of str1 is : " + str1.length());
		System.out.println();
		
		//displaying one char at a time of str1
		for(int i = 0; i < str1.length(); i++)
		{
			ch = str1.charAt(i);
			System.out.print(ch + " ");
		}
		
		System.out.println();
		System.out.println();
		//String equals method
		
		if(str1.equals(str2))
			System.out.println("Str2 is equal to str1");
		else
			System.out.println("Str2 is NOT equal to str1");
			
		System.out.println();
		
		if(str1.equals(str3))
			System.out.println("Str3 is equal to str1");
		else
			System.out.println("Str3 is NOT equal to str1");
		
		System.out.println();
		
		
		//compareTo method of String
		res = str1.compareTo(str3);
		
		if(res == 0)
			System.out.println("str1 is equal to str3 in length");
		else if(res < 0)
			System.out.println("str3 is less than str1 in length");
		else
			System.out.println("str3 is more than str1 in length");
		
		System.out.println();
		//index of string 
		str1 = "One Two Three One";
		index = str1.indexOf("One");
		
		System.out.println("The index of One in str1 is : " + index);
		
		index = str1.lastIndexOf("One");
		
		System.out.println("The index of One in str1 from end is : " + index);
	}

}
