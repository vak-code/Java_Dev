package com.vishal.enums;

//using built-in enumeration methods

//declaring transport enumeration

enum Transports {CAR, TRUCK, TRAIN, AIRPLANE, SHIP};

public class EnumDemo2 {
	
	public static void main(String[] args) {
		
		Transports tp;
		
		System.out.println("All the values of transport enum : ");
		
		Transports[] t = Transports.values();
		
		for(Transports i : t)
			System.out.println(i.toString());
		
			System.out.println(Transports.values());
		
			System.out.println("Value of tp.AIRPLANE is : " + Transports.AIRPLANE);
			//System.out.println("Value of tp.AIRPLANE is : " + tp());
			
	//	String tp = Transports.valueOf("AIRPLANE");
		
		
	//	System.out.println("Value of tp is : " + tp);

	}
	


}
