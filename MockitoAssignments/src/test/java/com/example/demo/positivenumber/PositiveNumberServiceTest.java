package com.example.demo.positivenumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PositiveNumberServiceTest {

	@InjectMocks
	PositiveNumberService posNumObj;
	
	@Mock
	PositiveNumberDP dataProvider;
	
	@Test
	void testIsPositive() {
		when(dataProvider.readNum()).thenReturn(10);
		assertEquals(false, posNumObj.isPositive());
	}

}
