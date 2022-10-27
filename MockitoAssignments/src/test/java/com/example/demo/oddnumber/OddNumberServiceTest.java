package com.example.demo.oddnumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OddNumberServiceTest {

	@InjectMocks
	OddNumberService oddNumObj;
	
	@Mock
	OddNumberDP dataProvider;
	
	@Test
	void testIsOdd() {
		when(dataProvider.readNum()).thenReturn(5);
		assertEquals(true, oddNumObj.isOdd());
	}

}
