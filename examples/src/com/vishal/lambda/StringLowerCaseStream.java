package com.vishal.lambda;

import java.util.Comparator;
import java.util.List;

public class StringLowerCaseStream {

	public static void main(String[] args) {

		List<String> langs = List.of("Java", "Basics", "Algol", "Python", "C++");

		System.out.println("Programming Languages");
		langs.stream().forEach(System.out::println);
		System.out.println();

		System.out.println("To lowercase only");
		langs.stream().map(n -> n.toLowerCase()).forEach(System.out::println);
		System.out.println();

		System.out.println("To lower and sorted");
		langs.stream().map(String::toLowerCase).sorted().forEach(System.out::println);
		System.out.println();

		System.out.println("To lower, reversed sorted but only with 'a' leter");
		langs.stream().filter(n -> n.contains("a")).map(String::toLowerCase).sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		System.out.println();
		langs.stream().map(n->n.toUpperCase()).filter(n->n.contains("A")).sorted().forEach(System.out::println);
	}
}
