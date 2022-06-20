package com.java8.basics.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamComparatorExample {
	
public static List<Student> sortByName()
{
  return StudentDatabase.getAllStudents().stream().
  sorted(Comparator.comparing(Student::getName))
  .collect(Collectors.toList());
}

public static List<Student> sortByGpa()
{
  return StudentDatabase.getAllStudents().stream().
  sorted(Comparator.comparing(Student::getGpa))
  .collect(Collectors.toList());
}

public static List<Student> sortByGpaDescending()
{
  return StudentDatabase.getAllStudents().stream().
  sorted(Comparator.comparing(Student::getGpa).reversed())
  .collect(Collectors.toList());
}

public static List<Student> sortByGpaWithoutStreams()
{
	List<Student> studentList = StudentDatabase.getAllStudents();
	
	
  studentList.sort(Comparator.comparing(Student::getGpa).thenComparing(Student::getName).reversed());
  return studentList;
}
public static List<Student> sortByGpaAndName()
{
  return StudentDatabase.getAllStudents().stream().
  sorted(Comparator.comparing(Student::getGpa)).
  sorted(Comparator.comparing(Student::getName))
  .collect(Collectors.toList());
  
}
	
	public static void main(String[] args) {
		
		System.out.println(sortByName());
		sortByGpaWithoutStreams().forEach(System.out::println);

	}

}
