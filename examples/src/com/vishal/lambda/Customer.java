package com.vishal.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Customer {

	private int id;
	private String name;
	
	public Customer(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		List<Customer> custList = new ArrayList<Customer>();
		
		custList.add(new Customer(1, "John"));
		custList.add(new Customer(2, "David"));
		custList.add(new Customer(3, "Abraham"));
		
		Map<Integer,String> custMap = custList.stream().collect(Collectors.toMap(Customer::getId, Customer::getName));
		System.out.println(custMap);
		
	}
}
