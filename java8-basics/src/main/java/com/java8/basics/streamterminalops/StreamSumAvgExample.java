package com.java8.basics.streamterminalops;

import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamSumAvgExample {
	
	
	
	
	public static int getTotalNotebooks()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.summingInt(Student::getNotebooks));
	
	}
	
	public static Double getAverageNotebooks()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.averagingInt(Student::getNotebooks));
	
	}
	
	public static void main(String[] args) {

		System.out.println(getTotalNotebooks());
		System.out.println(getAverageNotebooks());
	}

}
