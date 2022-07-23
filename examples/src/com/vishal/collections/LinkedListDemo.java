package com.vishal.collections;

import java.util.LinkedList;

//Linked List Demo
public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<String> morningRoutines = new LinkedList<>();
		
		if(!morningRoutines.isEmpty())
			System.out.println("The list is not empty. The first element is : " + morningRoutines.getFirst());
		
		if(!morningRoutines.isEmpty() && morningRoutines.peekFirst() != null)
			System.out.println("The first pick is : " + morningRoutines.peekFirst());
		
		morningRoutines.add("Brushing my teeths");
		morningRoutines.addFirst("Taking my dog for walk!");
		morningRoutines.push("Doing push-ups");
		morningRoutines.add("having BATH");
		morningRoutines.offer("Read one chapter of a book");
		morningRoutines.addFirst("having breakfast my teeths");
		
		System.out.println("----------------------------------------");
		
		System.out.println( morningRoutines);
		
		System.out.println("----------------------------------------");
		
		System.out.println("The pick first is : " + morningRoutines.peekFirst());
		System.out.println("The pick last is  : " + morningRoutines.peekLast());
		System.out.println("The poll is : " + morningRoutines.poll());
		System.out.println("The first poll is : " + morningRoutines.pollFirst());
		System.out.println("The last poll is : " + morningRoutines.pollLast());
		
		
		System.out.println("----------------------------------------");
		
		System.out.println( morningRoutines);
		
		System.out.println("----------------------------------------");
		
		if(!morningRoutines.isEmpty())
			System.out.println("The list is not empty. The first element is : " + morningRoutines.getFirst());
		
		if(!morningRoutines.isEmpty() && morningRoutines.peekFirst() != null)
			System.out.println("The first pick is : " + morningRoutines.peekFirst().toUpperCase());
		
System.out.println("----------------------------------------");
		
		System.out.println( morningRoutines);
		
		System.out.println("----------------------------------------");
		
	}
}
