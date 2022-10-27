package com.example.demo.accountbalance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringTestAssignmentsApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringTestAssignmentsApplication.class)
class AccountBalanceTest {

	@Autowired
	AccountBalance accountBalanceObj;
	
	@Test
	void testIsBalanceValid() {
		assertEquals(false, accountBalanceObj.isBalanceValid(900));
	}

}
