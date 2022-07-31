package com.vishal.enums;

import java.util.Objects;

public class CustomObjEqqualsTest {

	String name;

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomObjEqqualsTest other = (CustomObjEqqualsTest) obj;
		return Objects.equals(name, other.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		CustomObjEqqualsTest t1 = new CustomObjEqqualsTest();
		CustomObjEqqualsTest t2 = new CustomObjEqqualsTest();

		CustomObjEqqualsTest t3 = new CustomObjEqqualsTest();
		CustomObjEqqualsTest t4 = new CustomObjEqqualsTest();

		t1.setName("Amit");
		t2.setName("Amit");

		t3.setName("Sachin");
		t4.setName("Raj");

		System.out.println(t1.equals(t2));
		System.out.println(t3.equals(t4));

	}
}
