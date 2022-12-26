package com.vishal.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(3,6,856,52,67,36));
		ListIterator iterator = arrayList.listIterator();
		
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		
		System.out.println();
		LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(3,6,856,52,67,36));
		
		Iterator<Integer> linkIterator = linkedList.descendingIterator();
		
		while(linkIterator.hasNext())
			System.out.print(linkIterator.next()+" ");
	}
}
