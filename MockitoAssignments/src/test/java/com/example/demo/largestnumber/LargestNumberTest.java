package com.example.demo.largestnumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LargestNumberTest {

	@InjectMocks
	LargestNumber 	largestNumberObj;
	
	@Mock
	LargestNumberDP 	dataProvider;
	
	@Test
	void testFindMax() {
		
		when(dataProvider.readArray()).thenReturn(new int[] {283, 9, 834, 74,0 , 849, 4, 9082, 4});
		assertEquals(9082, largestNumberObj.findMax());
		
	}

	@Test
	void testFindNegsMax() {
		
		when(dataProvider.readArray()).thenReturn(new int[] {283, -9, 834, 74,0 , 849, 4, -9082, -4});
		assertEquals(9082, largestNumberObj.findMax());
		
	}
}
