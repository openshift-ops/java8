package com.java8.basics.streamterminalops;

import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamJoiningExample {
	
	
	public static String joining_1()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getName)
		.collect(Collectors.joining());
	}
	
	public static String joining_2()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getName)
		.collect(Collectors.joining("-"));
	}
	
	public static String joining_3()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getName)
		.collect(Collectors.joining("-", "(", ")"));
	}
	
	
	public static void main(String[] args) {

		System.out.println(joining_1());
		System.out.println(joining_2());
		System.out.println(joining_3());
	}

}
