package com.java8.basics.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class BiConsumerExample {
	
	
	public static void printNameAndActivities()
	{
		List<Student> studentList = StudentDatabase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (name,activity) -> System.out.println("Name :" + name + " Activity :" + activity);
		studentList.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
		
		
	}
	
	
	
	public static void main(String[] args) {

		BiConsumer<String, String> biStringExample = (a,b) -> System.out.println("a :" + a +  " b :" + b); 
		
		biStringExample.accept("Hello", "World");
		
		//So basically if we want to perform any operation using 2 varibales where we dont need any return type we can use BiConsumer
		
		BiConsumer<Integer, Integer> biMultiplyExample = (a,b) -> System.out.println(a * b); 
		
		BiConsumer<Integer, Integer> biDivisionExample = (a,b) -> System.out.println(a/b);
		
		biMultiplyExample.andThen(biDivisionExample).accept(20,4);
		
		printNameAndActivities();
		
		
		
	}

}
