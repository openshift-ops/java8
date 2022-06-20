package com.java8.basics.optional;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {
	
	public static Optional<String> ofNullable()
	{
		return Optional.ofNullable("Hello"); //Use this when the wrapped object may be null or not null.
	}
	
	public static Optional<String> of()
	{
		return Optional.of("Hello"); //Use this when the wrapped obj is never null
	}
	
	public static Optional<String> empty() 
	{
		return Optional.empty(); //Return an empty value
		
	}
	
	
	
	public static void main(String[] args) {

		
		System.out.println(ofNullable());
		System.out.println(of());
		System.out.println(empty());
		
		
		
	}

}
