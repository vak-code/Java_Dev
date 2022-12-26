package com.vishal.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToArrayList {

	public static void main(String[] args) {
		
		 ArrayList<String> listOfFruits = Stream.of("apple","banana","mango","pear","kiwi","chickoo")
				 .map(String::toUpperCase)
		.collect(Collectors.toCollection(ArrayList<String>::new));
		
		System.out.println(listOfFruits);
		
		System.out.println();
		Stream<String> fruits = Arrays.stream(new String[]{"apple","banana","mango","pear","kiwi","chickoo"});
		System.out.println(fruits.map(String::toUpperCase)
				.collect(Collectors.toCollection(ArrayList::new)));
		
		
	}
}
