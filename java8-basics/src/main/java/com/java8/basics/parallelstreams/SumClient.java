package com.java8.basics.parallelstreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class SumClient {
	
	
	
	public static void main(String[] args) {

		
		Sum sum = new Sum();
		
		
		IntStream.rangeClosed(0, 100000).forEach(sum::performSum);  //Squesntially here when we are uswing a mutable object i.e. an 
		//instance variable of Sum class we are getting the correct result as single thread is updating it and accesiing it at one time
		
		
		IntStream.rangeClosed(0, 100000).parallel().forEach(sum::performSum);//In parallel scenarios here when we are uswing a mutable object i.e. an 
		//instance variable of Sum class we are getting the incorrect result as concurrent threads are updating it and accesiing it at one time
		//So when mutable objects are present dont use parallel streams.
		
		System.out.println(sum.getTotal());
		
		
//		List<Integer> newList = Arrays.asList(1,2,3,4,5);
//		Function<List<Integer>,Integer> func1 = (s) -> {
//			
//			s.forEach(s1 -> {
//			
//				sum.performSum(s1);
//				
//			});
//			return sum.getTotal();
//		};
//		
//		System.out.println(func1.apply(newList));
		
		
	}

}
