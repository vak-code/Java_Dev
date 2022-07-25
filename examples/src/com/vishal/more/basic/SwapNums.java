package com.vishal.more.basic;

public class SwapNums {

	public static void main(String[] args)
	{
		int first = 12, second = 25;
		
		System.out.println("<======= BEFORE SWAP ===========>");
		System.out.println("First = " + first);
		System.out.println("Second = " + second);
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("<======= AFTER SWAP ===========>");
		System.out.println("First = " + first);
		System.out.println("Second = " + second);		

	}
}
