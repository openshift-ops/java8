package com.java8.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamReduceExample
{
	

	public static int performMultiplication(List<Integer> integerList)
	{
		return integerList.stream().reduce(1,(a,b) -> a*b);
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList)
	{
		return integerList.stream().reduce((a,b) -> a*b);
	}
	
	//Student with the highest GPA
	
	public static Optional<Student> findStudentWithTheHighesGPA()
	{
		return StudentDatabase.getAllStudents().stream()
				.reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 :s2);
	}
	
public static void main(String[] args) {
	List<Integer> integerList = Arrays.asList(1,2,3,4,56);
	
	System.out.println(performMultiplication(integerList));
	
	if(performMultiplicationWithoutIdentity(integerList).isPresent())
	{
		System.out.println(performMultiplicationWithoutIdentity(integerList));
	}
	
	if(findStudentWithTheHighesGPA().isPresent())
	{
		System.out.println(findStudentWithTheHighesGPA().get());
	}
	
}



}