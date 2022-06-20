package com.java8.basics.numericstreams;

import java.util.List;
import java.util.function.LongToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreasmBoxingUnBoxingExample {

	
	public static List<Integer> boxing()
	{
		return IntStream.rangeClosed(1, 10).
		//int to Integer
		boxed().collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer> integerList)
	
	//wrapper to primitive
	
	{
		
		
		return integerList.stream().mapToInt(Integer::intValue)
				.sum();
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Boxing " + boxing());
		
		
		List<Integer> integerList = boxing();
		
		System.out.println(unboxing(integerList));
		
		
		
		
	}
	
}
