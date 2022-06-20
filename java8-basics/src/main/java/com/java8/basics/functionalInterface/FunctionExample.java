package com.java8.basics.functionalInterface;

import java.util.function.Function;

import com.java8.basics.data.Employee;

public class FunctionExample {

	
	static Function<String, String> function = (s) -> s.toUpperCase();
	
	static Function<String, String> function1 = (s) -> s.toUpperCase().concat("Default");
	
	static Function<String, String> function2 = (s) -> s.concat("Hello");
	
	static Function<String,Employee> function3 = Employee::new;
	
	public static void main(String[] args) {
		
		System.out.println(function.apply("java"));
		System.out.println(function1.apply("java"));
		
		System.out.println(function.andThen(function1).apply("java"));
		
		System.out.println(function.compose(function1).apply("java"));
		
		System.out.println(function.andThen(function1).compose(function2).apply("java")); //JAVAHELLODefault

	}
}
