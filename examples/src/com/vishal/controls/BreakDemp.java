package com.vishal.controls;

//Shows working of a BREAK statement
public class BreakDemp {
	
	public static void main(String[] args)
	{
		int num = 100;
		
		for(int i = 0; i < num ; i++)
		{
			if((i * i) >= num)
				break;			//This will break the FOR LOOP if IF condition is met
			
			System.out.print(i + " ");
		}
		
		System.out.println("Loop completed!");
	}
	

}
