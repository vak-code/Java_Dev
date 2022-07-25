package com.vishal.more.classobj;

//declare the class as final

final class Immutable
{
	//private and final class instance vars
	private final String name;
	private final int date;
	

	
	Immutable(String name, int date)
	{
		this.name = name;
		this.date = date;
	}
	
	//only getters and no setters
	public String getName()
	{
		return this.name;
	}
	
	public int getDate()
	{
		return this.date;
	}
}
public class ImmutableTest {

	public static void main(String[] args)
	{
		//creating object of Immutable
		Immutable test = new Immutable("Java",2022);
		
		System.out.println(test.getName());
		System.out.println(test.getDate());
		
	}
}
