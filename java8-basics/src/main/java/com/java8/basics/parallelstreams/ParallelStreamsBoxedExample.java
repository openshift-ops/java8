package com.java8.basics.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsBoxedExample {
	
	
	
	public static void checkPerformance(List<Integer> integerList)
	{
		long startTime = System.currentTimeMillis();
		integerList.stream().parallel().reduce(0,(x,y) -> x+y);    ///so here parallel streams will have worse performance tahn sequesntial stream as there is an extra effort
															//which is spent to do unboxing of integer to int and then concurrently perform the sum.
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> integerList = IntStream.rangeClosed(0, 100000).boxed()
				.collect(Collectors.toList());
		checkPerformance(integerList);

	}

}
