package com.example.demo.maxoftwo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class MaxOfTwoTest {

	@Autowired
	MaxOfTwo maxObj;
	
	@Test
	void testFindMax() {
		assertEquals(5, maxObj.findMax(10, 5));
	}

}
