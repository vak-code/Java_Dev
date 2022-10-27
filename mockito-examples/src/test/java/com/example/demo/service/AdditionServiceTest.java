package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.sumofelements.AdditionService;
import com.example.demo.sumofelements.DataProvider;

@ExtendWith(MockitoExtension.class)
//@ContextConfiguration(classes=MockitoExamplesApplication.class)
class AdditionServiceTest {
	@InjectMocks
	AdditionService additionService;

	@Mock
	DataProvider dataProvider;

	@Test
	void testAdditionWithThreeValues() {
		// AdditionService additionService = new AdditionService();
		when(dataProvider.getElements()).thenReturn(new int [] {2,3,4});

		assertEquals(9, additionService.sumOfAllNosFromArray());
	}
	
	@Test
	void testAdditionWithTwoValues() {
		// AdditionService additionService = new AdditionService();
		when(dataProvider.getElements()).thenReturn(new int [] {2,3,});

		assertEquals(5, additionService.sumOfAllNosFromArray());
	}
	
	@Test
	void testAdditionWitheroValues() {
		// AdditionService additionService = new AdditionService();
		when(dataProvider.getElements()).thenReturn(new int [] {});

		assertEquals(0, additionService.sumOfAllNosFromArray());
	}

}
