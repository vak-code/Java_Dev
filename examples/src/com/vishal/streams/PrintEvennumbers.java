package com.vishal.streams;

import java.util.List;

public class PrintEvennumbers {

	public static void main(String[] args) {
		
		List<Integer> listOfNumbers = List.of(3,4,7,3,7,4,32,7,5,4,6,5,76,3,5576);
		
		listOfNumbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
