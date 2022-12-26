package com.vishal.streams;

import java.io.IOException;
import java.util.Arrays;

public class StreamFindAverageSquare {

	public static void main(String[] args) throws IOException{
		
		Arrays.stream(new int[] {6,8,3,7,4}).map(n -> n*n).average().ifPresent(System.out::println);
		Arrays.stream(new int[] {0,10000}).map(n -> n*n).average().ifPresent(System.out::println);
	}
}
