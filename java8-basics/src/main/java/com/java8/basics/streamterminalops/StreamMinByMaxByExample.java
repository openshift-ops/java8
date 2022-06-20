package com.java8.basics.streamterminalops;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamMinByMaxByExample {
	
public static Optional<Student> minBy_Example()
{


	return StudentDatabase.getAllStudents().stream()
			.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
}

public static Optional<Student> maxBy_Example()
{


	return StudentDatabase.getAllStudents().stream()
			.collect(Collectors.minBy(Comparator.comparing(Student::getGradeLevel)));
}
	
	
	public static void main(String[] args) {
		
		System.out.println(minBy_Example());
		System.out.println(maxBy_Example());

	}

}
