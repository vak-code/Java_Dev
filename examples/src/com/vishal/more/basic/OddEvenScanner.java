package com.vishal.more.basic;

import java.util.Scanner;

public class OddEvenScanner {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = reader.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + " is an even");
		else
			System.out.println(num + " is an Odd");
	}
	
}
