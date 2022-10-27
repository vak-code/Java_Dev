package com.example.demo.reversenumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class ReverseNumberTest {

	@Autowired
	ReverseNumber revNumObj;
	
	@Test
	void testRevNum() {
		assertEquals("04321", revNumObj.revNum(12340));
	}

}
