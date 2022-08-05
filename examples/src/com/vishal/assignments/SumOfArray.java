package com.vishal.assignments;

//It gives sum of an array of 5 numbers
public class SumOfArray {
	
	public int arraySum(int[] nums)
	{
		int sum = 0;
		
		for(int i : nums)
		{
			//System.out.print(i + " ");
			sum += i;	
		}
		System.out.println("Sum : " + sum);
		return sum;
	}
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int[] nums = {10, 20, 30, 40, 50};
	 * 
	 * int sum = 0;
	 * 
	 * System.out.print("The sum of these numbers : (");
	 * 
	 * for(int i : nums) { System.out.print(i + " "); sum += i;
	 * 
	 * }
	 * 
	 * System.out.println(") is : " + sum);
	 * 
	 * }
	 */
	 

}
