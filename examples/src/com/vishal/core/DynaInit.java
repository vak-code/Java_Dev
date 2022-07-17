package com.vishal.core;

//This class demonstrates dynamic initialization of variables
public class DynaInit {

	public static void main(String[] args)
	{
		double radius=3, height=5;
		
		//dynamic initialization of volume of cylinder
		double volume = 3.14 * radius * radius * height;
		
		System.out.println("The volume is : " + volume);
	}
}
