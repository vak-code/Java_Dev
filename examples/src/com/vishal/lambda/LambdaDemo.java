package com.vishal.lambda;

import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {

		List<Integer> nums = List.of(10, 3, 9, 4, 0, 1, 4);
		
		System.out.println("All numbers");
		nums.stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("All even nums");
		nums.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("All odd ones");
		nums.stream().filter(n->n%2==1).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Any one of them");
		nums.stream().filter(n->n==1).forEach(System.out::println);
		
		
	}
}
