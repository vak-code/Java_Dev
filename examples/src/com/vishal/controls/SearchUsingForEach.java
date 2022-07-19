package com.vishal.controls;

//This shows how to search in an array using FOR EACH block
public class SearchUsingForEach {
	
	public static void main(String[] args)
	{
		int[] nums = {4, 5, 3, 9, 7, 0, 1, 6};
		int val = 9;
		boolean found = false;
		
		//iterates through array values
		for(int x : nums)
		{
			//if the current value in array is equal to required value then 
			//set the found and break
			
			if(x == val)
			{
				found  = true;
				break;
			}
		}
		
		if(found)
			System.out.println("Value Found");
	}

}
