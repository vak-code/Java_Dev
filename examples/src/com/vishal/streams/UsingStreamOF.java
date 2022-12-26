package com.vishal.streams;

import java.io.IOException;
import java.util.stream.Stream;

public class UsingStreamOF {

	public static void main(String[] args) throws IOException{
		Stream.of("Too","Zoo","Aoo").sorted().findFirst().ifPresent(System.out::println);
		Stream.of("Too","Zoo","Aoo").findFirst().ifPresent(System.out::println);
		Stream.of("Too","Zoo","Aoo").findFirst().ifPresent(System.out::println);
	}
}
