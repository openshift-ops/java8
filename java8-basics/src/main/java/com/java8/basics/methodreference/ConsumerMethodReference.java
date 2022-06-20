package com.java8.basics.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class ConsumerMethodReference {
	
	
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	
	static Consumer<Student> c2 = System.out::println;
	
	static Consumer<Student> c3 = Student::printActivities;
	
	Supplier<List<String>> s1 = () -> new ArrayList<>();
	
	Supplier<List<String>> s2 = ArrayList::new;
	
	public static void main(String[] args) {

		
		StudentDatabase.getAllStudents().forEach(c1);
		StudentDatabase.getAllStudents().forEach(c2);
		StudentDatabase.getAllStudents().forEach(c3);
	}

}
