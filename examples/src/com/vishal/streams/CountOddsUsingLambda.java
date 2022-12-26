package com.vishal.streams;

import java.util.List;

public class CountOddsUsingLambda {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = List.of(4,6,2,723,7,25,8,267,836,76,28,8,5);
		
		long countOfOdds = listOfNums.stream().filter(x -> (x%2) == 1).count();
		
		System.out.println("Count of odds in " + listOfNums + " is " + countOfOdds);
	}
}
