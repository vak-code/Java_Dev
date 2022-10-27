package com.example.demo.balancezero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class ZeroBalanceServiceTest {

	@Autowired
	ZeroBalanceService zeroBalObj;
	
	@Test
	void testIsBalZero() {
		assertEquals(true, zeroBalObj.isBalZero(2.1));
	}

}
