package com.vishal.core;

//Command line arguments demo
public class CLDemo {

	public static void main(String[] args)
	{
		System.out.println("There are "+args.length+" arguments passed to this class");
		
		System.out.println("They are :");
		for(int i=0;i<args.length;i++)
			System.out.println("args["+i+"] = "+args[i]);
	}
}
