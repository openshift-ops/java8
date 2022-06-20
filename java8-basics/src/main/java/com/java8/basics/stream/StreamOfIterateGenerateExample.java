package com.java8.basics.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import com.java8.basics.data.Student;

public class StreamOfIterateGenerateExample {
	
	
	public static void main(String[] args) {

		//Of Method
		Stream<String> stringStream = Stream.of("Bishesh","Bhavna","Barun");
		stringStream.forEach(System.out::println);
		
		//iterate method
		Stream<Integer> intStream = Stream.iterate(1, (x) -> x*2).limit(10);
		intStream.forEach(System.out::println);
		
		//iterate method
		UnaryOperator<List<String>> unaryOps = (x) -> {
			x.add("Nihar");
			return x;
		};
		Stream<List<String>> stringStream2 = Stream.iterate(new ArrayList<String>(),unaryOps).limit(10);
		stringStream2.forEach(System.out::println);
		
		//generate method
		Student s = new Student();
		Supplier<Integer> supplier = new Random()::nextInt;
		Supplier<Integer> supplierStudent = s::getGradeLevel; 
		Stream<Integer> intStream2 = Stream.generate(supplier).limit(10);
		intStream2.forEach(System.out::println);
		
	}

}
