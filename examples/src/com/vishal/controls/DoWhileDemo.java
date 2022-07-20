package com.vishal.controls;

//This program shows a DO WHILE loop demo
public class DoWhileDemo {
	
	public static void main(String[] args) throws java.io.IOException
	{
		char ch;
		
		//Below is DO WHILE loop
		do {
			ch = (char) System.in.read();
			System.out.print("Press any key and hit ENTER! : ");
			
			
			
			System.out.println("The value entered is : " + ch);
			
		}while (ch != 'q');  /// notice the semicolon here
		
		System.out.println("thank you");
	}

}
