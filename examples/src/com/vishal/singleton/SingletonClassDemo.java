package com.vishal.singleton;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass singletonObject1 = SingletonClass.getInstance();
		singletonObject1.setValue("This is First object");
		singletonObject1.showValue();
		System.out.println(singletonObject1);
		System.out.println();
		
		
		SingletonClass singletonObject2 = SingletonClass.getInstance();
		singletonObject2.showValue();
		singletonObject2.setValue("changed by second");
		System.out.println(singletonObject2);
		System.out.println();
		
		singletonObject1.showValue();
		System.out.println(singletonObject1);
		System.out.println();
				
	}
}
