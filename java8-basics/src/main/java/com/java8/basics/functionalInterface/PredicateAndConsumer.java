package com.java8.basics.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class PredicateAndConsumer {
	
	
	Predicate<Student> p1 = (student) -> student.getGpa() >=3.9;
	
	
	Predicate<Student> p2 = (student) -> student.getGradeLevel() >=3;
	
	BiPredicate<Integer, Double> biPredicate = (gradeLevel,gpa) -> gradeLevel >=3 && gpa >=3.9;
	
	BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println("name :" + name + " activities :" + activities);
	
	Consumer<Student> consumer = (student) -> {
		
//		if(p1.and(p2).test(student))
//		{
//			biConsumer.accept(student.getName(), student.getActivities());
//		}
		
		if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
		{
			biConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	
	
	
	public void printStudent(List<Student> studentList)
	{
		studentList.forEach(consumer);
	}
	public static void main(String[] args) {

		
		new PredicateAndConsumer().printStudent(StudentDatabase.getAllStudents());
	}

}
