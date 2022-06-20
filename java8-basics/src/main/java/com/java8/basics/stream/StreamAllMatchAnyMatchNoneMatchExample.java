package com.java8.basics.stream;

import com.java8.basics.data.StudentDatabase;

public class StreamAllMatchAnyMatchNoneMatchExample {
	
	
	public static boolean anyMatch()
	{
		return StudentDatabase.getAllStudents().stream()
		.anyMatch((s) -> s.getGpa() >= 3.9);
	}
	
	public static boolean allMatch()
	{
		return StudentDatabase.getAllStudents().stream()
				.allMatch((s) -> s.getGpa() >= 3.9);
	}
	
	public static boolean noneMatch()
	{
		return StudentDatabase.getAllStudents().stream()
				.noneMatch((s) -> s.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {

		System.out.println( "AnyMatch :" + anyMatch());
		
		System.out.println("AllMatch :" +allMatch());
		
		System.out.println("NoneMatch :" +noneMatch());
		
	}

}
