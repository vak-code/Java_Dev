package com.vishal.collections;

import java.util.ArrayList;

public class WebShopList {
	
	public static void main(String[] args)
	{
		ArrayList<Product> products = new ArrayList<>();
		
		System.out.println("ArrayList size : " + products.size());
		
		products.add(new Product("iPhone",999.99,"iphone is costly"));
		products.add(new Product("AirPods",199.99,"AirPods are cool;"));
		products.add(new Product("Apple Watch",299.99,"Apple Watch looks Awesome"));
		//products.get(3);
		System.out.println("ArrayList size : " + products.size());
		
		for(Product p : products)
			System.out.println(p);
		
		products.add(0,new Product("iPad",499.99,"Excellent tab"));
		products.set(1, new Product("MacBook",1999.99,"Powerful and awesome laptops"));
		
		System.out.println("ArrayList size : " + products.size());
		
		for(Product p : products)
			System.out.println(p);
		
		System.out.println("2nd element : " + products.get(2));
		
	}

}
