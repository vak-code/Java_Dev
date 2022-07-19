package com.vishal.controls;

//This program shows a DO WHILE loop demo
public class DoWhileDemo {
	
	public static void main(String[] args) throws java.io.IOException
	{
		char ch;
		
		//Below is DO WHILE loop
		do {
			
			System.out.print("Press any key and hit ENTER! : ");
			
			ch = (char) System.in.read();
			
			//System.out.println("The value entered is : " + ch + ". Enter q to quit");
			
		}while(ch != 'q');  /// notice the semicolon here
		
		System.out.println("thank you");
	}

}
