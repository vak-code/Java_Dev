package com.vishal.controls;

//This program shows FOR EACH block demo
public class ForEachBlockDemo {
	
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		//Below is the FOR EACH loop iterating through the values of array nums
		for(int x : nums)
		{
			System.out.println("The value is : " + x);
			sum += x;
		}
		
		System.out.println("The Summaton is : " + sum);
	}

}
