package com.java8.basics.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class SupplierExample {

	
	static Supplier<Student> supplier = () -> {
		
		return new Student("Bishesh", 7, 4.0, "Male", Arrays.asList("swimming","gymanstics"),10);
	};
	
static Supplier<List<Student>> supplier2 = () -> StudentDatabase.getAllStudents();
	 
	public static void main(String[] args) {
		
		
		System.out.println(supplier.get());
		
		System.out.println(supplier2.get());

	}
	
	
}
