package com.java8.basics.numericstreams;

import java.util.List;
import java.util.function.IntToLongFunction;
import java.util.function.LongToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	
	public static List<Integer> mapToObj()
	{
		return IntStream.rangeClosed(1, 5).
		mapToObj((i) -> 
		{
			return new Integer(i); //Basically we can create  stream of any object which takes an integeras an input and will return that object
		}).collect(Collectors.toList());
	}
	
	
	public static long mapToLong()
	{
		
		return IntStream.rangeClosed(1, 5).
		mapToLong((i) -> i)   //returns a long stream
		.sum();
	}
	
	public static double mapToDouble()
	{
		
		return IntStream.rangeClosed(1, 5).
		mapToDouble((i) -> i)   //returns a double stream
		.sum();
	}

	
	public static void main(String[] args) {

		
		System.out.println(mapToObj());
		System.out.println(mapToDouble());
		System.out.println(mapToLong());
		
	}
	
}
