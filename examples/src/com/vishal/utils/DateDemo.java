package com.vishal.utils;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		int hours = today.getHours();
		
		System.out.println("Today is : " +today);
		System.out.println("Hours :" + hours);
	}
}
