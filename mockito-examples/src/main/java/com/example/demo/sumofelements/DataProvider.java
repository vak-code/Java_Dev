package com.example.demo.sumofelements;

import org.springframework.stereotype.Component;

@Component
public interface DataProvider {
	public int[] getElements();
}
