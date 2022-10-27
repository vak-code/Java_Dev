package com.example.demo.factorialservice;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FactorialTest {

	@InjectMocks
	Factorial factorialObj;
	
	@Mock
	DataProviderFactorial dataProvider;
	
	@Test
	void calculatFactorialTest() {
		when(dataProvider.readData()).thenReturn(5);
		assertEquals(120, factorialObj.calculatFactorial());
	}
	
	@Test
	void calculateFactorialNegText()
	{
		when(dataProvider.readData()).thenReturn(-5);
		assertEquals(120, factorialObj.calculatFactorial());
	}

}
