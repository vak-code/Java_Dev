package com.example.demo.squareof;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SquareOfANumberTest {

	@InjectMocks
	SquareOfANumber squareObj;
	
	@Mock
	DataProvider dataProvider; 
	
	@Test
	void findSquareTest() {
		when(dataProvider.readNum()).thenReturn(10);
		
		assertEquals(100, squareObj.findSquare());
	}
	
	@Test
	void findSquareNegTest() {
		when(dataProvider.readNum()).thenReturn(-10);
		
		assertEquals(100, squareObj.findSquare());
	}
	
	@Test
	void findSquareZeroTest() {
		when(dataProvider.readNum()).thenReturn(0);
		
		assertEquals(1, squareObj.findSquare());
	}

}
