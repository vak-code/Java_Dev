package com.example.demo.sumofelements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class SumOfIntArrayTest {

	@Autowired
	SumOfIntArray intArrayObj;
	
	@Test
	void testGetSum() {
		assertEquals(11, intArrayObj.getSum(new int[] {1, 2, 3, 4}));
	}

}
