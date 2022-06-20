package com.java8.basics.optional;

import java.util.Optional;

import com.java8.basics.data.Bike;
import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class OptionalMapFlatMapFilterExample {
	
	
	public static void optionalFilter()
	{
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.supplier.get());
		
		optionalStudent.filter((s) -> s.getGpa()>3.5).ifPresent((s) -> System.out.println(s));
	}
	
	
	public static void optionalMap()
	{
		//Use the map method of optional when we want to transform it to the optional of any other type or perform opertaion on the object 
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.supplier.get());
		
		if(optionalStudent.isPresent())
		{
		Optional<String> optionalString =  optionalStudent.filter((s) -> s.getGpa()>=3.5).map(Student::getName);
		
		
		System.out.println(optionalString.get());
		}
		
	}
	
	
	public static void optionalFlatMap()
	{
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.supplier.get()); //This methpd is used to flatten the object in order to retrieve the optional object 
		//inside another optional object.
		//If we have a optional inside of another optional then only use flatmap method.
		 Optional<String> name = optionalStudent.filter((s) -> s.getGpa()>=3.5)   //2 levels of optional
				 .flatMap(Student::getOptionalBike)
				 .map(Bike::getName);
		 
		 name.ifPresent(System.out::println);
		 
	}
	
	
	
	
	public static void main(String[] args) {

		optionalFilter();
		optionalMap();
		optionalFlatMap();
		
	}

}
