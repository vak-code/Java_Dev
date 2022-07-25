package com.vishal.more.basic;

import java.util.Scanner;

public class ScanNum {

	public static void main(String[] args)
	{
		//Create a reader instance to read input from keyboard
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		//reads an integer from keyboard
		int num = reader.nextInt();
		
		System.out.println("You have entered : " + num);
		
	}
}
