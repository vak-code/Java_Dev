package com.example.demo.positivenumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class PositiveNumberTest {

	@Autowired
	PositiveNumber positiveNumObj;
	
	@Test
	void testIsPositive() {
		assertEquals(false, positiveNumObj.isPositive(-10));
	}

}
