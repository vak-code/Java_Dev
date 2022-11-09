package com.vishal.core;

public class ConstructorDemo {

	private String name;
	
	public ConstructorDemo(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		ConstructorDemo object = new ConstructorDemo("Shiv");
		//object.name="Shiv";
		System.out.println(object.name);
		ConstructorDemo obj2  = new ConstructorDemo();
	}
}
