package com.vishal.assignments;

//It finds the greatest out of 3 ints
public class FindMaxIntOutOf3 {

	public int findMax(int num1, int num2, int num3)
	{
		int max;
		
		System.out.println("The 3 numbers are : " + num1 + ", " + num2 + ", " + num3);
		
		if(num1 > num2)
		{
			if(num1 > num3)
				max = num1;
			else
				max = num3;
		}
		else
		{
			if(num2 > num3)
				max = num2;
			else 
				max = num3;
		}
		
		return max;
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int num1 = 10; int num2 = 55; int num3 = -1; int max;
	 * 
	 * System.out.println("The 3 numbers are : " + num1 + ", " + num2 + ", " +
	 * num3);
	 * 
	 * if(num1 > num2) { if(num1 > num3) max = num1; else max = num3; } else {
	 * if(num2 > num3) max = num2; else max = num3; }
	 * 
	 * System.out.println("The MAX of them is : " + max); }
	 */
}
