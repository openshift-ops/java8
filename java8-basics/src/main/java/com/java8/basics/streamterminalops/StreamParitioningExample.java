package com.java8.basics.streamterminalops;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamParitioningExample {
	
	
	public static Map<Boolean, List<Student>> partitioningby_1()
	{
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.partitioningBy((student) -> student.getGpa() >= 3.8));
	}
	
	
	public static List<String> flatMapping()
	{
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.flatMapping((s) -> s.getActivities().stream(),Collectors.toList()));
	}
	
	public static Map<Boolean, Optional<Student>> partitioningby_2()
	{
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.partitioningBy((student) -> student.getGpa() >= 3.8,
						Collectors.maxBy(Comparator.comparing(Student::getGpa))));
	}
	
	public static void main(String[] args) {

		System.out.println(partitioningby_1());
		System.out.println(flatMapping());
		System.out.println(partitioningby_2());
		
	}

}
