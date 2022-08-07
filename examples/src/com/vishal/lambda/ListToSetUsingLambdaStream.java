package com.vishal.lambda;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetUsingLambdaStream {

	public static void main(String[] args) {
		
		Set<String> toSet = Arrays
				.asList("pineapple","banana","pear","mango","apple","chickoo")
				.stream().filter(n->n.contains("a")).collect(Collectors.toSet());
		System.out.println(toSet);
	}
}
