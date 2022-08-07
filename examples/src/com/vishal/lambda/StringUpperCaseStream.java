package com.vishal.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringUpperCaseStream {

	public static void main(String[] args) {

		// Stream<String> fruits =
		// Stream.of("apple","kiwi","banana","mango","pineapple");
		List<String> fruits = List.of("kiwi", "banana", "pineapple", "mango", "banana");

		System.out.println("All fruits in uppercase");

		fruits.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println();

		System.out.println("All fruits sorted");
		fruits.stream().sorted().forEach(System.out::println);
		System.out.println();

		System.out.println("Reverse order");
		fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();

		System.out.println("UpperCase only fruits with A");
		fruits.stream().filter(n -> n.contains("a")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println();

		System.out.println("Uppercase only with I sorted");
		fruits.stream().filter(n -> n.contains("i")).map(String::toUpperCase).sorted().forEach(System.out::println);

		fruits = null;

	}
}
