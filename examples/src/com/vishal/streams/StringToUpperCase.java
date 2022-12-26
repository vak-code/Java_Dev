package com.vishal.streams;

import java.util.stream.Stream;

public class StringToUpperCase {

	public static void main(String[] args) {
		Stream<String> streamOfFruits = Stream.of("apple","mango","chickoo","banana","pineapple","pear");
		streamOfFruits.map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
