package com.vishal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinListUsingStream {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("ABCDFFP");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("AbrahamBecameFirstPresidentOfAmerica");
		
		List<String> joinedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println();
		System.out.println(list2);
		System.out.println();
		System.out.println(joinedList);
	}
}
