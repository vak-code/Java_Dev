package com.vishal.more.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllCollections {

	public static void main(String[] args) {
		
		List<String> list = List.of("a","b","b","b");
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		System.out.println("Printing all");
		System.out.println("list = " + list);
		System.out.println("Set = " + set);
		System.out.println("Map = " + map);
		
		System.out.println();
		
		set.addAll(List.of(1,5,6,4,34,65,3,2,1));
		System.out.println("Printing all");
		System.out.println("list = " + list);
		System.out.println("Set = " + set);
		System.out.println("Map = " + map);
		
		System.out.println();
		map.put(1, "A");
		map.put(2, "B");
		
		System.out.println("Printing all");
		System.out.println("list = " + list.get(0));
		System.out.println("Set = " + set);
		System.out.println("Map = " + map);
		
		System.out.println();
		
		Stream stream = list.stream();
		stream=stream.distinct();
		//list.clear();
		list=(ArrayList<String>) stream.collect(Collectors.toList());
		map.put(2,"C");
		list.add("D");
		System.out.println("Printing all");
		System.out.println("list = " + list);
		System.out.println("Set = " + set);
		System.out.println("Map = " + map);
		
		System.out.println();
		
		set.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("Printing all");
		System.out.println("list = " + list.size());
		System.out.println("Set = " + set.size());
		System.out.println("Map = " + map.size());
		
		System.out.println();
	}
}
