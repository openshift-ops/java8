package com.java8.basics.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {
	
	public static Supplier<Student> supplier = () -> {
		Bike b = new Bike("ABC", "XYZ");
		Student s = new Student("Bishesh", 2, 3.6, "male", Arrays.asList("swimming","basketball","volleyball"),12);
		s.setOptionalBike(Optional.ofNullable(b));
		return s;
	};
	
	
	public static List<Student> getAllStudents()
	{
		Student student1 = new Student("Bishesh", 2, 3.6, "male", Arrays.asList("swimming","basketball","volleyball"),11);
		Student student2 = new Student("Jesey", 2, 3.8, "female", Arrays.asList("swimming","gymanstics","soccer"),10);
		
		
		Student student3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming","gymanstics","aerobics"),9);
		Student student4 = new Student("Sibu", 3, 3.9, "male", Arrays.asList("swimming","gymanstics","soccer"),13);
		
		
		Student student5 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("swimming","dancing","football"),14);
		Student student6 = new Student("Biswa", 4, 3.9, "male", Arrays.asList("swimming","basketball","baseball","football"),15);
		
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
		return students;
	}

}
