package com.sample.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Conversions:
 * 		array to ArraList: which does not work on primitives
 * 		String to primitive
 * @author AANU
 *
 */
public class CollectionSamples {
	public static void main(String[] args) {
		String[] strArr = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		List<String> list = Arrays.asList(strArr);
		
		System.out.println(list);
		
		int[] intArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		List<Integer> list2 = new ArrayList<>();// = Arrays.asList(intArr);
		list2.add(1);
		
		String strInt = "15";
		String strLong = "217";
		String strDouble = "28.0f";
		
		double d = Double.valueOf(strDouble);
		long l = Long.valueOf(strLong);
		int i = Integer.valueOf(strInt);
		
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
	}
}
