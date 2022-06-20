package com.java8.basics.methodreference;

import java.util.function.Predicate;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class RefactorMethodReference {
	
	static Predicate<Student> predicate = RefactorMethodReference::filterGpa;
	
	public static boolean filterGpa(Student s)
	{
		return s.getGpa() >= 3.9;
	}
	
	public static void main(String[] args) {

		
		System.out.println(predicate.test(StudentDatabase.supplier.get()));
		
	}

}
