package com.java8.basics.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamsExample {

	
	
	static Predicate<Student> p1 = (s) -> s.getGpa()>=3.9;
	
	static Predicate<Student> p2 = (s) -> s.getGradeLevel()>=3;
	
	public static void main(String[] args) {

		Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
				.peek((student) -> {
					System.out.println("No Ops" + student.getName());
				})
		.filter(p1)//Stream<Students> //Intermediate Ops
		.peek((student) -> {
			System.out.println("First Ops" +student.getName());
		})
		.filter(p2)//Stream<Students> //Intermediate Ops
		.peek((student) -> {
			System.out.println("Second Ops" +student.getName());
		})
		.collect(Collectors.toMap(Student::getName, Student::getActivities)); //<Map> //Terminal ops
		
		System.out.println(studentMap);
		
		
	}

}
