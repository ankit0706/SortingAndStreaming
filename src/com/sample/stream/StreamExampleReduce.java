package com.sample.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleReduce {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Stream<Integer> stream = list.stream();
		int sum = stream.reduce(0, (a, b) -> a + b);
		System.out.println("sum = " + sum);
		int product = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println("product = " + product);
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		Stream<String> strStream = letters.stream();
		String concatenation = strStream.reduce("", (a, b) -> a.concat(b));
		System.out.println("concatenation = " + concatenation);
	}
}
