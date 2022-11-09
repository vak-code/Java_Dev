	package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.BlockChainApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=BlockChainApplication.class)
class BlockChainServiceUnitTest {

	@Autowired
	BlockChainService blockService;
	
	
	@Test
	void testCalculateCurrencyRate() {
		assertEquals(100, blockService.calculateCurrencyRate());
	}

}
