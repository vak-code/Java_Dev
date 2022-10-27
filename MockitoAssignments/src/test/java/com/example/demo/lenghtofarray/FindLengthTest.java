package com.example.demo.lenghtofarray;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FindLengthTest {

	
	@InjectMocks
	FindLength findLengthObj;
	
	@Mock
	FindLengthDP dataProvider;
	
	@Test
	void testFindLength() {
		
		when(dataProvider.readNumbers()).thenReturn(new int [] {3, 4, 5, 43, 75, 85,54, 769, 0});
		
		assertEquals(9, findLengthObj.findLength());
	}
	
	@Test
	void testFindLengthZero() {
		
		when(dataProvider.readNumbers()).thenReturn(new int [] {3, 4, 5, 43, 75, 85,0, 0, 0});
		
		assertEquals(6, findLengthObj.findLength());
	}

}
