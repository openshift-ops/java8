package com.java8.basics.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class PredicateExample {
	
	static Predicate<Integer> p = (a) -> a%2==0;
	
	static Predicate<Integer> p1 = (a) -> a%5==0;
	
	static Predicate<Student> p2 = (student) -> student.getGradeLevel() >= 3;
	
	static Predicate<Student> p3 = (student) -> student.getGpa() >= 3.9;
	
	
	public static  void filterStudentByGradeLevel()
	{
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach((s) -> {
			if(p2.test(s))
			{
				System.out.println(s.getName());
			}
		});
		
		  
	}
	
	public static void filterStudentByGpaLevel()
	{
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach((s) -> {
			if(p3.test(s))
			{
				System.out.println(s.getName());
			}
		});
		
		  
	}
	
	
	public static void filterStudents()
	{
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach((s) -> {
			if(p2.and(p3).test(s))
			{
				System.out.println(s.getName());
			}
		});
		
		  
	}
	
	public static void testAnd()
	{
		System.out.println(p.and(p1).test(8)); //Predicate chaining
	}
	
	public static void testOr()
	{
		System.out.println(p.or(p1).test(8)); //Predicate chaining
	}
	
	public static void testNegate()
	{
		System.out.println(p.and(p1).negate().test(8)); //Predicate chaining
	}
	
	public static void main(String[] args) {

		
		
		//Basically we can use predicate when we need to do validation with and , or and negate operations
		System.out.println(p.test(4));
		
		System.out.println(p1.test(10));
		
		testAnd();
		testOr();
		testNegate();
		filterStudentByGradeLevel();
		filterStudentByGpaLevel();
	}

}
