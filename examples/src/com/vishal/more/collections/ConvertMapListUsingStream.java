package com.vishal.more.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertMapListUsingStream {

	public static void main(String[] agr)
	{
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "A");
		myMap.put(2, "B");
		myMap.put(3, "C");
		myMap.put(4, "D");
		myMap.put(5, "E");
		
		List<Integer> keyl = myMap.keySet().stream().collect(Collectors.toList());
		List<String> valuel = myMap.values().stream().collect(Collectors.toList());
		
		System.out.println("Key List : " + keyl);
		System.out.println("Value List : " + valuel);
	}
}
