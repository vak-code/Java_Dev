package com.vishal.more.basic;

//Ascii demo
public class AsciiValue {
	
	public static void main(String[] args)
	{
		char ch = 'a';
		int ascii = ch;
		int castAscii = (int) ch;
		
		System.out.println("Ascii value of " + ch + " = " + ascii);
		System.out.println("Ascii value of " + ch + " = " + castAscii);
	}

}
