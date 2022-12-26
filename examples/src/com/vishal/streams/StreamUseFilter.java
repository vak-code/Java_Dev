package com.vishal.streams;

import java.io.IOException;
import java.util.Arrays;

public class StreamUseFilter {

	public static void main(String[] args) throws IOException{
		String[] names = {"Vishal","Andy","Amit","Sachin","Andy","David","Lisa","Mary"};
		Arrays.stream(names).filter(x -> x.startsWith("A")).sorted().forEach(System.out::println);
	}
}
