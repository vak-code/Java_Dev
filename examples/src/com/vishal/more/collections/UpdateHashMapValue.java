package com.vishal.more.collections;

import java.util.HashMap;

public class UpdateHashMapValue {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> nums = new HashMap<>();
		
		nums.put("First", 1);
		nums.put("Second", 2);
		nums.put("Third", 3);
		
		System.out.println("Original HashMap : " + nums);
		
		//reading d value of key second
		int value = nums.get("Second");
		value *= value;
		
		//putting back the modified value
		nums.put("Second", value);
		
		System.out.println("Modified HashMap : " + nums);
	}

}
