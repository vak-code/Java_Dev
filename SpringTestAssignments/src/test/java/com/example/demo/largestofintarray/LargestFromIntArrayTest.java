package com.example.demo.largestofintarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class LargestFromIntArrayTest {

	@Autowired
	LargestFromIntArray largestArrayObj;
	
	@Test
	void testFindLargest() {
		assertEquals(10, largestArrayObj.findLargest(new int [] {4, -10, 5, 9 , 3 ,1 ,5 , -9}));
	}

}
