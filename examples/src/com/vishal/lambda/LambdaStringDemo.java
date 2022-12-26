package com.vishal.lambda;

import java.util.List;
import java.util.stream.Collector;

public class LambdaStringDemo {
	
	public static void main(String[] args) {

		List<String> cities = List.of("Rio", "Mumbai", "New York", "Houston", "Delhi");

		System.out.println("All cities--->");
		cities.stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Length of each is");
		cities.stream().filter(n->n.contains("i")).map( n->(n+" "+n.length())).forEach(System.out::println);
		System.out.println();
		
		cities.stream().map(n->(n+" "+n.length())).forEach(System.out::println);
		
//		System.out.println("All cities name length--->");
//		cities.stream().mapToInt(String::length).forEach(System.out::println);
		//System.out.println(cities.stream().count());
		
		//Print square of each number in the list using stream, and map
		//Print cube of each number
		//print square of even nums
		//print square of odd nos
		// print cube of even nos
		//print cube of odd nums
		//print factorial of each number
		
	}

}
