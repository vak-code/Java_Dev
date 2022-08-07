package com.vishal.lambda;

import java.util.List;

public class CountOddNumsListLambda {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(2, 4, 33, 5, 43, 90, 53, 4343, 5, 6, 90, 4);
		System.out.println("List of nums is : " + nums);
		long count = nums.stream().filter(n -> n%2==1).count();
		System.out.println("Count of odds : " + count);
	}
}
