package com.java8.basics.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOps = (a) -> a.concat("Default"); 
	
	public static void main(String[] args) {
		
		unaryOps.apply("Java");

	}
}
