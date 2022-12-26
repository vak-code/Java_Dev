package com.vishal.streams;

import java.util.List;

public class FindStringUsingStream {

	public static void main(String[] args) {
		
	
	List<String> fruits = List.of("apple","banana","pineale","pear","mango","apple");
	
	String result = fruits.stream().filter(x -> x.equals("banana")).findAny().orElse(null);
	System.out.println("String '" + result + "' is found.");
	}
}
