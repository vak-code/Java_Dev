package com.vishal.assignments;

import java.util.Arrays;

public class SecondLargestInt {

	public static void main(String[] args) {
		int[] input = {64,6,634,63,68,3,85,0,8};
		
		Arrays.sort(input);
		
			System.out.println(input[input.length-2]);
	}
}
