package com.java8.basics.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreamExample {
	
	public static List<Integer> sumOfNInteger(List<Integer> integerList)
	{
		Function <Integer,Integer> func1 = (a) -> IntStream.rangeClosed(1, a)
				//x =1 ,y =2
				//x=2,y = 3
				//.
				//.
				.reduce((x,y) -> x*y).getAsInt();
//		Function<Integer, Integer> func1 = (a) -> a*
//		
		return integerList.stream().map(func1).collect(Collectors.toList());
	}
	
	
	
	
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		System.out.println(sumOfNInteger(integerList));
		
		
	}

}
