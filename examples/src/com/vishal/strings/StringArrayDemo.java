package com.vishal.strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//String Array Demo
public class StringArrayDemo {
	
	public static void main(String[] a)
	{
		String[] text = {"This","is","a","Test"};
		String names = "amit vishal ramesh july vishal";
		String longS = "01234567890";
		System.out.println( "01234".substring(2, 4));
		
		Map<String,Integer> map = Collections.synchronizedMap(new HashMap<String,Integer>());
	
		for(String i : names.split(" "))
		{
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i)+1);
		}
		 map.put(null, null);
		 map.put(null, 43);
		 
		 map = new ConcurrentHashMap<>();
		 
		 map.put(null, 43);
		 
		 
		System.out.println(map);
		int[] nums = {1,2,3,4,5,6};
		
		for(String str : text)
			System.out.print(str + " ");
		
		System.out.println();
		
		//Modifying the String
		text[1] = "was";
		text[3] = "test, too";
		
		for(String str : text)
			System.out.print(str + " ");
		
	}

}
