package com.vishal.controls;

//This shows SWITCH CASE demo
public class SwitchCaseDemo {

	public static void main(String[] args)
	{
		int i;
		
		for(i = 1; i <= 10; i++)
		{
			switch(i)
			{
				case 1:
					System.out.println("i is 1");
					break;
					
				case 2:
					System.out.println("i is 2");
					break;
					
				case 3:
					System.out.println("i is 3");
					break;
					
				case 4:
					System.out.println("i is 4");
					break;
					
				default:
					System.out.println("i is 5 or More");
			}
		}
	}
}
