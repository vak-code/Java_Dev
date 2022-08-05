package com.vishal.assignments;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateSquareTest {

	static CalculateSquare calculateSquare;

	@BeforeClass
	public static void beforeClass() {
		calculateSquare = new CalculateSquare();
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		//calculateSquare = new CalculateSquare();
		System.out.println("Before");
	}

	@After
	public void after() {
		//calculateSquare = null;
		System.out.println("After");
	}

	@Test
	public void testCalcSquare() {
		// fail("Not yet implemented");

		int calcSquare = calculateSquare.calcSquare(2);

		// System.out.println(calcSquare);
		assertEquals(4, calcSquare);
		System.out.println("testCalcSquare");
	}

	@Test
	public void testCalcSquareWithZero() {
		// fail("Not yet implemented");

		int calcSquare = calculateSquare.calcSquare(0);

		// System.out.println(calcSquare);
		assertEquals(0, calcSquare);
		System.out.println("testCalcSquareWithZero");
	}
	
	@Test(expected=NullPointerException.class)
	public void testException()
	{
		System.out.println("Exception Test");
		calculateSquare.calcSquare(null);
		//throw new NullPointerException();
		
	}

}
