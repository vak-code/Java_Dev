package com.vishal.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesUsingStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,5,1,3,5,1,7));
		
		System.out.println("List with duplicates : " + listOfNumbers);
		
		Stream<Integer> stream = listOfNumbers.stream();
		
		stream = stream.distinct();
		
		listOfNumbers = (ArrayList<Integer>) stream.sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List without duplicates : " + listOfNumbers);
	}
}
