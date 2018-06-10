package com.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
	public static void main(String[] args) {
		// stream();
		// stream1();
		// stream2();
		//stream3();
		stream4();
	}

	public static void stream() {
		Integer myInt[] = new Integer[] { 4, 5, 6, 9, 11 };
		Stream<Integer> stream = Arrays.stream(myInt);
		stream.forEach(System.out::println);

		System.out.println("Stream Done!");
	}

	public static void stream1() {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().filter(s -> s.startsWith("c")).map(s -> s + " Append Map").map(s -> s + " Append Map").sorted()
				.forEach(System.out::println);

		System.out.println("Stream1 Done!");
	}

	public static void stream2() {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().findFirst().map(a -> a + " = > First").ifPresent(System.out::println);

		System.out.println("Stream2 Done!");
	}

	public static void stream3() {
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
		int myIntArray[] = new int[] { 4, 5, 6, 9, 11 };
		IntStream streamInteger = Arrays.stream(myIntArray);

		int sumval = streamInteger.sum();
		System.out.println(sumval);
		

		System.out.println("Stream3 Done!");
	}
	
	public static void stream4() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	}
}
