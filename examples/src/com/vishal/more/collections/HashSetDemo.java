package com.vishal.more.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args)
	{
		Set<String> langs = new HashSet<>();
		
		langs.add("Java");
		langs.add("Python");
		langs.add("C++");
		
		System.out.println("Languages : " + langs);
		
		System.out.println("\n");
		//iterating Set using FOR EACH
		System.out.println("iterating Set using FOR EACH");
		for(String i : langs)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n");
		//iterating Set using Iterator
		System.out.println("terating Set using Iterator");
		Iterator<String> iterator = langs.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + ", ");
		
		System.out.println("\n");
		//iterating using Lambda function call on forEach method
		System.out.println("terating using Lambda function call on forEach method");
		langs.forEach((e) -> {
			System.out.print(e + ",");
		});
	}
}
