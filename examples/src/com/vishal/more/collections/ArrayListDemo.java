package com.vishal.more.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		//creating an ArrayList Object of type String
		ArrayList<String> languages = new ArrayList<>();
		
		System.out.println("ArrayList size at start : " + languages.size());
		languages.add("Java");
		languages.add("Python");
		languages.add("Ruby");
		
		System.out.println("ArrayList size after 3 add : " + languages.size());
		System.out.println("Languages = " + languages);
		
		System.out.println("Iterating over the list using FOR loop");
		for(int i = 0; i< languages.size(); i++)
			System.out.print(languages.get(i) + ", ");
		
		System.out.println();
		
		System.out.println("Iterating using FOR EACH loop");
		for(String i : languages)
			System.out.print(i + ", ");
		
		System.out.println();
		
		System.out.println("Iterating using ListIterator");
		ListIterator<String> iterator = languages.listIterator();
		
		while(iterator.hasNext())
			System.out.print(iterator.next() + ", ");
	}
}
