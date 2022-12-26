package com.vishal.assignments;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "a1b2c3d";
		char[] output = new char[input.length()];
		
		for(int i = (input.length()-1) ; i >=0 ; i--)
		{
			char temp = input.charAt(i);
			
			if((65 <= temp && temp <= 90) || (97 <= temp && temp <= 122))
				output[(input.length()-1) - i] = temp;
			else
				output[i] = temp;
			
		}
		
		System.out.println(output);
	}
}
