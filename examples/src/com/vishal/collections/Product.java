package com.vishal.collections;

import java.util.Objects;

public class Product {
	
	private String name;
	private double price;
	private String description;
	
	public Product(String name, double price, String description)
	{
		this.name = name;
		this.price = price;
		this.description = description;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if( this == o) return true;
		
		if(o == null || o.getClass()!= this.getClass()) return false;
		
		Product d = (Product) o;
		
		return Double.compare(price, d.price) ==0 && Objects.equals(name,d.name) && Objects.equals(description, d.description);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(name, price, description);
	}
	
	@Override 
	public String toString()
	{
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
	}

}
