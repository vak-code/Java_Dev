package com.example.demo.stringlength;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class StringLengthTest {

	@Autowired
	StringLength strLengthObj;
	
	@Test
	void testStringLength() {
		assertEquals(5, strLengthObj.stringLength("ABCD"));
	}

}
