package com.example.demo.smallestnumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FindSmallestTest {

	@InjectMocks
	FindSmallest findSmallestObj;
	
	@Mock
	FindSmallestDP dataProvider;
	
	@Test
	void findSmallestTest() {
		
		when(dataProvider.readArray()).thenReturn(new int [] {4, 4, 54, 45 ,7 ,8, 45, 8,7});
		assertEquals(4, findSmallestObj.findSmallest());
	}
	
	@Test
	void findSmallestNegsTest() {
		
		when(dataProvider.readArray()).thenReturn(new int [] {4, 4, 54, 45 ,7 ,8, -45, 8,-7});
		assertEquals(-45, findSmallestObj.findSmallest());
	}

}
