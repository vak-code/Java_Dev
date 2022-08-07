package com.vishal.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToArrayList {

	public static void main(String[] args) {
		
		Stream<String> fruits = Stream.of("chickoo","pineapple","banana","apple","mango","");
		System.out.println(fruits.filter(n -> n!= null && n.length() > 5).collect(Collectors.toCollection(ArrayList<String>::new)));
	}
}
