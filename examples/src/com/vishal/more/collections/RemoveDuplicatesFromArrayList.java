package com.vishal.more.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String[] args) {
		
		//Creating an ArrayList of Integers with duplicate number using Arrays.asList
		ArrayList<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 3, 4, 1, 3));
		
		System.out.println("List is : " + numbers);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		//adding the list data into set which removes duplicates
		set.addAll(numbers);
		
		//clearing the existing list
		numbers.clear();
		
		//now adding back the list data back to list which doesn't contain duplicates
		numbers.addAll(set);
		
		System.out.println("List after removing dups : " + numbers);
	}

}
