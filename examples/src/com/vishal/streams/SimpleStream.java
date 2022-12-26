package com.vishal.streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) throws IOException{
		Collection<String> collection = Arrays.asList("Kotlin","Soring Boot","Spring","C");
		
		Stream<String> stream = collection.stream();
		
		stream.forEach(System.out::println);
	}
}
