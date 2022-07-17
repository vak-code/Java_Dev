package com.vishal.core;

//This class reads a keyboard key
public class KeyboardInputDemo {
	
	public static void main(String[] args) throws java.io.IOException
	{
		char ch;
		
		System.out.print("Enter any key and press ENTER! : ");
		
		ch = (char) System.in.read(); //get a char
		
		System.out.println("The key you typed is : " + ch);
	}

}
