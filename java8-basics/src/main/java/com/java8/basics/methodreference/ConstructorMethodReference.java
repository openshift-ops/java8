package com.java8.basics.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.java8.basics.data.Student;

public class ConstructorMethodReference {
	
	static Supplier<Student> supplier = Student::new;
	
	static Function<String,Student> function = Student::new;
	
	
	public static void main(String[] args) {
		
		System.out.println(supplier.get());
		
		System.out.println(function.apply("Bishesh"));
		
		
		

	}

}
