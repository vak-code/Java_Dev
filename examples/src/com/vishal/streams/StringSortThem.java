package com.vishal.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StringSortThem {

	public static void main(String[] args) {
		
		Stream<String> fruitsStream = Stream.of("banana","Pear","apple","pear","kiwi","Apple","pineapple","banana");
		
		fruitsStream.distinct().sorted().forEach((x) -> System.out.print(x + ", "));
		
		System.out.println();
		fruitsStream = Stream.of("banana","Pear","apple","pear","kiwi","Apple","pineapple","banana");
		fruitsStream.distinct().sorted(Comparator.reverseOrder()).map(x -> x + ", ").forEach(System.out::print);
		
		System.out.println();
		fruitsStream = Stream.of("banana","Pear","apple","pear","kiwi","Apple","pineapple","banana");
		fruitsStream.distinct().sorted((i,j) -> j.compareTo(i)).map(x -> x + ", ").forEach(System.out::print);
				
	}
}
