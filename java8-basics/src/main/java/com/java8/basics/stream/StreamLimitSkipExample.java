package com.java8.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
	
	
	public static Optional<Integer> limitMethod (List<Integer> integerList)
	{
		return integerList.stream().limit(3)
		.reduce(Integer::sum);
	}
	
	public static Optional<Integer> skipMethod (List<Integer> integerList)
	{
		return integerList.stream().skip(3)
		.reduce(Integer::sum);
	}
	
	
	public static void main(String[] args) {

List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		
		Optional<Integer> number1 = limitMethod(integerList);
		
		 Optional<Integer> number2 = skipMethod(integerList);
		 
		 if(number1.isPresent())
		 {
			 System.out.println(number1.get());
		 }
		 
		 if(number2.isPresent())
		 {
			 System.out.println(number2.get());
		 }
		
		
	}

}
