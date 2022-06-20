package com.java8.basics.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamFlatMapExample {
	
	
	
	static Comparator<String> c1 = String::compareTo;

public static List<String> getActivities()
{
	
	return StudentDatabase.getAllStudents().stream() //Stream<Student>
	.map(Student::getActivities) //Stream<List<String>>
	.flatMap(List::stream) //Stream<String>
	.distinct() //Unique Stream<String>
	.sorted(c1) //Sorted in natural order Stream<String>
	.collect(Collectors.toList());
	
	}

public static List<Student> getStudents()
{
	
	return StudentDatabase.getAllStudents().stream()
			.sorted()//Stream<Student>//Note if we call sorted method on a class wich do not extend comparable interface then on calling sorted method that will throw classcast
			//exception error as it does npot know how to sort it based on which parameter.
			//This works if the class implemets comparable interface
			
	.collect(Collectors.toList());
	
	
	
	}

public static Long getCount()
{
	
	return StudentDatabase.getAllStudents().stream() //Stream<Student>
	.map(Student::getActivities) //Stream<List<String>>
	.flatMap(List::stream) //Stream<String>
	.distinct() //Unique Stream<String>
	.count();
	
	}
public static void main(String[] args) {
	
	System.out.println(getActivities());
	System.out.println(getCount());
	System.out.println(getStudents());

}

}
