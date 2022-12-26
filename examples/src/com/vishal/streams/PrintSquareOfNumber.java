package com.vishal.streams;

import java.util.List;

public class PrintSquareOfNumber {

	public static void main(String[] args) {
		List<Integer> listOfNums = List.of(43,5,2,6,545,26);
		
		listOfNums.stream().map(n -> "Square of " + n + " = "+n*n).forEach(System.out::println);
	}
}
