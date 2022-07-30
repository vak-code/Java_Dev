package com.vishal.enums;

//declaring an Enum
enum Transport {CAR, TRUCK, TRAIN, AIRPLANE, SHIP};

public class EnumsDemo {

	public static void main(String[] args)
	{
		Transport tp;
		
		tp = Transport.TRAIN;
		
		System.out.println("Value of tp.train is : " + tp);
		System.out.println();
		
		tp = Transport.AIRPLANE;
		
		if(tp == Transport.AIRPLANE)
			System.out.println("the value of tp is AIRPLANE");
		
		//enum can be used to control switch case 
		switch(tp)
		{
			case CAR:
				System.out.println("car carries 4 people");
				break;
				
			case TRAIN:
				System.out.println("Train carries boggies");
				break;
				
			case TRUCK:
				System.out.println("Truck carries Frieght");
				break;
				
			case AIRPLANE:
				System.out.println("Airplne flies");
				break;
				
			case SHIP:
				System.out.println("Ship swims across oceans");
				break;
		
		}
	}
}
