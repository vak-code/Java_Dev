package com.vishal.streams;

import java.util.List;
import java.util.stream.Stream;

public class StringStreamSkip {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("pear","apple","mango","banana","pear");
		
		long count = fruits.stream().count();
		
		fruits.stream().skip(count - 1).forEach(System.out::println);
	}
}
