package com.java8.basics.streamterminalops;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamsMappingExample {

	public static void main(String[] args) {

		
		List<String> studentList = StudentDatabase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName,Collectors.toList()));
		
		Set<String> studentSet = StudentDatabase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName,Collectors.toSet()));
		
		System.out.println(studentList);
		System.out.println(studentSet);
		
	}
}
