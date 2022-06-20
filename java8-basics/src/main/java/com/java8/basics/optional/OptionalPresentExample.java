package com.java8.basics.optional;

import java.util.Optional;

public class OptionalPresentExample {
	
	
	public static void main(String[] args) {

		Optional<String> optionalString = Optional.ofNullable(null);
		
		if(optionalString.isPresent())
		{
			System.out.println(optionalString.get());
		}
		
		
		
		optionalString.ifPresent((s) -> System.out.println(s)); //Use this if we want to check the value is present and then perform some operation usign that value.
		
	}
	

}
