package com.vishal.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToSet {

	public static void main(String[] args) {
		
		Set<String> outputSet = Arrays.asList("apple","banana","pear","juice","banana","pear")
				.stream()
				.sorted()
				.collect(Collectors.toSet());
		
		System.out.println(outputSet);
		
		List<String> outputList = Arrays.asList("apple","banana","pear","juice","banana","pear")
				.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(outputList);

	}
}
