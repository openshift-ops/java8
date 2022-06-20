package com.java8.basics.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class ConsumerExample {
	
	
	
	static List<Student> studentList = StudentDatabase.getAllStudents();
	
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
	
	
	//print name
	public static void printStudent()
	{
		studentList.forEach(c1);
	}
	//print name
	public static void printStudentName()
	{
		studentList.forEach(c2);
	}
	//print name and activities
	public static void printStudentNameAndActivities()
	{
		studentList.forEach(c2.andThen(c3));
	}
	//print name and activities based onCondition
	public static void printStudentNameAndActivitiesBasedOnCondition()
	{
		List<String> name = new ArrayList<>();
		//filteration
		studentList.forEach((student) -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() > 3.9)
			{
				
				c2.andThen(c3).accept(student);
			}
		});
		
	}
	
	public static void main(String[] args) {

	Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
	
	consumer.accept("java");
	printStudentNameAndActivitiesBasedOnCondition();
	
	
	
	}
	
	
	
	
}
