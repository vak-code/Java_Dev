package com.vishal.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetUsingLambdaStream {

	public static void main(String[] args) {
		
		List<String> listOf = Arrays.asList("pineapple","banana","pear","mango","apple","chickoo");
		
		System.out.println(listOf);
		Set<String> toSet = Arrays
				.asList("pineapple","banana","pear","mango","apple","chickoo")
				.stream().filter(n->n.contains("a")).collect(Collectors.toSet());
		System.out.println(toSet);
		
		 toSet = List.of("pineapple","banana","pear","mango","apple","chickoo")
					.stream().filter(n->n.contains("a")).collect(Collectors.toSet());
			System.out.println(toSet);
	}
}
