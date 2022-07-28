package com.vishal.more.collections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class RemoveDuplicatesFromListUsingStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList(Arrays.asList(1, 2, 3, 4, 1, 3));
		
		System.out.println("Original list : " + nums);
		
		//moving data of list to stream
		
		Stream<Integer> stream = nums.stream();
		
		//removing duplicates from the stream
		stream = stream.distinct();
		
		
		//Converting stream back to arraylist
		nums = (ArrayList<Integer>) stream.collect(Collectors.toList());
		
		System.out.println("After stram, List is : " + nums);
		
	}
}
