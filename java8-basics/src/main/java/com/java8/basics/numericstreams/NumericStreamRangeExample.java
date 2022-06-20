package com.java8.basics.numericstreams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
	
	
	public static void main(String[] args) {

		
		IntStream intstream = IntStream.range(1, 50);
		 
		System.out.println(intstream.count());
		
		IntStream.range(1, 50).forEach(System.out::println);
		
		IntStream intstream1 = IntStream.rangeClosed(1, 50);
		
		System.out.println(intstream1.count());
		
		
		LongStream longStream = LongStream.range(1, 50);
		
		LongStream longStream2 = LongStream.rangeClosed(1, 50);
		
		
		IntStream.range(1, 50).asDoubleStream().forEach(System.out::println);
		
		System.out.println(IntStream.rangeClosed(1, 50).sum());
		
		System.out.println(IntStream.rangeClosed(1, 50).max().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 50).min().getAsInt());
		
		System.out.println(IntStream.rangeClosed(1, 50).average());
	}

}
