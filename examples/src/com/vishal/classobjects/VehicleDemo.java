package com.vishal.classobjects;

//this program shows a simple vehicle class demo

class Vehicle
{
	int passengers; //passengers capacity
	int fuelCaps;	//Fuel Capacity	
}

public class VehicleDemo {
	
	public static void main(String[] args)
	{
		//Creating a minivan object of class Vehicle
		Vehicle miniVan = new Vehicle();
		
		miniVan.passengers = 7; //assigning value of passenger capacity
		miniVan.fuelCaps = 16; // assigning gallon capacity to minivan
		
		System.out.println("Passengers : " + miniVan.passengers + " Gallon Capacity : " + miniVan.fuelCaps);
	}

}
