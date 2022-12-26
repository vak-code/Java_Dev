package com.vishal.streams;

import java.util.List;

public class BooleanReturnFromStream {

	public static void main(String[] args) {
		
		List<String> listOfFruits = List.of("apple","banana","pineale","pear","mango","apple");
		
		boolean anyMatchWithLength9 = listOfFruits.stream().anyMatch(x -> x.length() >= 9);
		System.out.println("Any match with length 9 or more : " + anyMatchWithLength9);
		
		boolean anyMatchWithLength6 = listOfFruits.stream().anyMatch(x -> x.length() >= 6);
		System.out.println("Any match with length 6 or more : " + anyMatchWithLength6);
		
	}
}
