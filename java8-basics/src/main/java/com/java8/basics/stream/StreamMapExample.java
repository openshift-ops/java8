package com.java8.basics.stream;

import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamMapExample {
	
	
	
	public static List<String> getNameList()
	{
		
		//MAP FUNC IS USED WHEN WE WANT TO TRANSFORM FROM ONE TYPE TO ANOTHER TYPE OR PERFORM ANY FUNCTION ON EACH ELEMENT AND THEN PRODUCE A STREAM
		 return StudentDatabase.getAllStudents().stream() //Stream<Student>
		.map(Student::getName) //Stream<String>
		.map(String::toUpperCase) //Perform ops on the same type
		.collect(Collectors.toList());
	}
	
	
	public static List<Integer> getFactorialist()
	{
	UnaryOperator<Integer> unaryOps = (a)	 -> IntStream.rangeClosed(1, a).reduce((x,y) -> x*y).getAsInt();
		//MAP FUNC IS USED WHEN WE WANT TO TRANSFORM FROM ONE TYPE TO ANOTHER TYPE OR PERFORM ANY FUNCTION ON EACH ELEMENT AND THEN PRODUCE A STREAM
		 return StudentDatabase.getAllStudents().stream() //Stream<Student>
		.map(Student::getNotebooks) //Stream<String>
		.map(unaryOps) //Perform ops on the same type
		.collect(Collectors.toList());
	}
	
	public static Set<String> getNameSet()
	{
		 return StudentDatabase.getAllStudents().stream() //Stream<Student>
					.map(Student::getName) //Stream<String>
					.map(String::toUpperCase) //Perform ops on the same type
					.collect(Collectors.toSet());
	}
	
	public static void main(String[] args) {
		
		System.out.println(getNameList());
		System.out.println(getNameSet());
		System.out.println(getFactorialist());

	}

}
