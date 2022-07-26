package com.vishal.more.collections;

import java.util.*;

public class ConvertMapList {
	
	public static void main(String[] args)
	{
		Map<Integer,String> myMap = new HashMap<>();
		
		myMap.put(1 , "One");
		myMap.put(2, "Two");
		myMap.put(3, "Three");
		myMap.put(4, "Four");
		myMap.put(5, "Five");
		
		List<Integer> keyList = new ArrayList(myMap.keySet());
		List<String> valueList = new ArrayList(myMap.values());
		
		System.out.println("Key List : " + keyList);
		System.out.println("Value List : " + valueList);
	}
	

}
