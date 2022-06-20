package com.java8.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
	
	
	public static Optional<Integer> getMaxNumber(List<Integer> integerList)
	{
		return integerList.stream()
		.reduce((x,y) -> x>y ?x : y);
	}
	
	public static Optional<Integer> getMinNumber(List<Integer> integerList)
	{
		return integerList.stream()
		.reduce((x,y) -> x<y ?x : y);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		
		Optional<Integer> number1 = getMaxNumber(integerList);
		
		 Optional<Integer> number2 = getMinNumber(integerList);
		 
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
