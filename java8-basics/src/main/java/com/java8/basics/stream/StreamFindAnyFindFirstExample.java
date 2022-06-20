package com.java8.basics.stream;

import java.util.Optional;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamFindAnyFindFirstExample {

	
	public static Optional<Student> findAny()
	{
		return StudentDatabase.getAllStudents().stream()
		.filter((s) -> s.getGpa() >=3.9)
		.findAny();
	}
	
	public static Optional<Student> findFirst()
	{
		return StudentDatabase.getAllStudents().stream()
		.filter((s) -> s.getGpa() >=3.9)
		.findAny();
	}
	
	public static void main(String[] args) {

		System.out.println(findAny());
	
		System.out.println(findFirst());
	}
	
	
	
	
}
