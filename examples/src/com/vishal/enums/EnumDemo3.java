package com.vishal.enums;

//using enum constructor, instance variable and method

enum Transport3 {
	
	CAR(60), TRUCK(55), TRAIN(100), AIRPLANE(10000), SHIP(30);
	
	private int speed;
	
	Transport3(int s)
	{
		this.speed = s;
	}
	
	int getSpeed()
	{
		return speed;
	}
	
}
public class EnumDemo3 {

	public static void main(String[] args) {
		
		Transport3 tp = Transport3.AIRPLANE;
		
		System.out.println("The normal spped of " + tp + " is " + tp.getSpeed());
		
		System.out.println("Speed of different transports : ");
		
		for(Transport3 t : Transport3.values())
			System.out.println("The speed of " + t + " is " + t.getSpeed());
		
	}
}
