package com.vishal.more.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class JoinListsUsingStream {

	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		List<String> list2 = new ArrayList();
		List<String> join = new ArrayList();
		
		list1.add("AD");
		list2.add("BC");
		
		join = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println("list 1 : " + list1);
		System.out.println("list 2 : " + list2);
		System.out.println("Joined : " + join);
	}
}
