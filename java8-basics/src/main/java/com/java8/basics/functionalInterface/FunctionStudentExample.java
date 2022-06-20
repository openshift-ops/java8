package com.java8.basics.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String,Double>> function = (studentList) -> 
	{
		Map<String,Double> studentMap = new HashMap<>();
		studentList.forEach((s) -> {
			if(PredicateExample.p2.and(PredicateExample.p3).test(s))
			{
			studentMap.put(s.getName(), s.getGpa());
			}
			
		});
		return studentMap;
	};
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(function.apply(StudentDatabase.getAllStudents()));

	}

}
