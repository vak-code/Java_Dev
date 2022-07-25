package com.vishal.collections;

import java.util.Vector;

//Vector collection demo
public class VectorDemo {

	public static void main(String[] args)
	{
		Vector<String> items = new Vector<>(2,3);
		
		System.out.println("Vector Capacity : " + items.capacity());
		
		items.add("first");
		items.add("Second");
		//items.add("Third");
		
		System.out.println("Vector Capacity : " + items.capacity());
		System.out.println("Vector size : " + items.size());
		
		System.out.println("------------------");
		
		System.out.println("First element : " + items.firstElement());
		System.out.println("Last Element : " + items.lastElement());
				
	}
}
