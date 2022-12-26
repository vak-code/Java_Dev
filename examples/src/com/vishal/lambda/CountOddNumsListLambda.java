package com.vishal.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CountOddNumsListLambda {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(2, 4, 33, 5, 43, 90, 53, 4343, 5, 6, 90, 4);
		System.out.println("List of nums is : " + nums);
		long count = nums.stream().filter(n -> n%2==1).count();
		System.out.println("Count of odds : " + count);
		
		Optional<Integer> max = nums.stream().max((i,j) -> i.compareTo(j));
		System.out.println("MAX is: " + max.get());
		
		Optional<Integer> min = nums.stream().filter(x -> x % 2 == 0).min((i,j) -> i.compareTo(j));
		System.out.println("Even MIN is: " + min.get());
	}
}
