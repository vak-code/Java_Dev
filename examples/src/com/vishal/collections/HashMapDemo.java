package com.vishal.collections;

import java.util.Map;
import java.util.HashMap;

//HashMap demo
public class HashMapDemo {

	public static void main(String[] args)
	{
		Map<String, String> hp = new HashMap<>();
		String j = "Java";
		
		if(hp.containsKey(j))
			System.out.println("Java already present");
		else
		{
			hp.put(j,"Java is Compiled, OA and PI language");
			System.out.println("Added Java key");
		}
		
		j = "jdk";
		
		hp.put("Python", "Python is OA, Interpreted and typed language");
		hp.put("algol", null);
		
		System.out.println(hp.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
		System.out.println(hp.put("lisp", "Therein lies the madness"));
		
		if(hp.containsKey(j))
		{
			System.out.println("Java already present");
			System.out.println(hp.get("Java"));
		}
		else
		{
			hp.put("Java","Java is Compiled, OA and PI language");
			System.out.println("Java added");
		}
		System.out.println("<=========== HASH MAP Key : Value ==========>");
		for(String key : hp.keySet())
		{
			System.out.println(key + " : " + hp.get(key));
		}
		
	}
}
