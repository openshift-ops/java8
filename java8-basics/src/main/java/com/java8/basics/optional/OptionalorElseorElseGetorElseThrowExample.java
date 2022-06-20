package com.java8.basics.optional;

import java.util.ArrayList;
import java.util.Optional;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class OptionalorElseorElseGetorElseThrowExample {
	
	
	public static String orElse()
	{
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		
		return optionalStudent.map(Student::getName).orElse("Default"); //Or else method can be used when we want to send default values if the object
		//wrapped inside optional is null
		
	}
	
	public static String orElseGet()
	{
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.supplier.get());
		
		return optionalStudent.map(Student::getName).orElseGet(() -> "Default"); //Or else Get method can be used when we want to send default values if the object
		//wrapped inside optional is null.//Similar to or else but we have to give a supplier instead of the actual object
		
	}
	
	public static String orElseThrow()
	{
		//Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		
		return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("Object not found")); //Or else throw method can be used when we want to throw exception to the caller if the object is null
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(orElse());
		System.out.println(orElseGet());
		System.out.println(orElseThrow());

	}

}
