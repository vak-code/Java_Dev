package com.example.demo.zeronumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ZeroNumberServiceTest {
	
	@InjectMocks
	ZeroNumberService zeroNumObj;
	
	@Mock
	ZeroNumberDP dataProvider;

	@Test
	void testIsZero() {
		when(dataProvider.readNum()).thenReturn(1);
		assertEquals(true, zeroNumObj.isZero());
	}

}
