package com.example.demo.cubeof;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CubeOfANumberTest {

	@InjectMocks
	CubeOfANumber cubeObj;
	
	@Mock
	DataProviderCube dataProvider;
	
	@Test
	void findCubeTest() {
		when(dataProvider.readNum()).thenReturn(10);
		assertEquals(1000, cubeObj.findCube());
	}

	@Test
	void findCubeNegTest() {
		when(dataProvider.readNum()).thenReturn(-10);
		assertEquals(-1000, cubeObj.findCube());
	}
}
