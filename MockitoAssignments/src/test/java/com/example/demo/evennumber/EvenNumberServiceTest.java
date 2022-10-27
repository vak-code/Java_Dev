package com.example.demo.evennumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EvenNumberServiceTest {
	
	@InjectMocks
	EvenNumberService evenNumObj;
	
	@Mock
	EvenNumberDP dataProvider;

	@Test
	void testIsEven() {
		
		when(dataProvider.readNumber()).thenReturn(10);
		assertEquals(true, evenNumObj.isEven());
	}

}
