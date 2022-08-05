package com.vishal.assignments;

//This program swaps 2 numbers
public class SwapNums {
	
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		int temp;
		
		System.out.println("Before Swap num1 : " + num1 + " & num2 : " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swap num1: " + num1 + " & num2 " + num2);
	}

}
