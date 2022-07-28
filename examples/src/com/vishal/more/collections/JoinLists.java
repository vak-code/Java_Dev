package com.vishal.more.collections;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {
	
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList();
		List<String> list2 = new ArrayList();
		List<String> join = new ArrayList();
		
		list1.add("A");
		list1.add("B");
		
		list2.add("1");
		list2.add("2");
		
		join.addAll(list1);
		join.addAll(list2);
		
		System.out.println("List 1 : " + list1);
		System.out.println("List 2 : " + list2);
		System.out.println("Join of list 1 & 2 is : " + join);
	}

}
