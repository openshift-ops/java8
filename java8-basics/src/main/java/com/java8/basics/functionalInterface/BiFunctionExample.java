package com.java8.basics.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class BiFunctionExample {
	
	
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (studentList,predicate)
			-> {
				Map<String,Double> studentMap = new HashMap();
				
				studentList.forEach((s) -> {
					if(predicate.test(s))
					{
						studentMap.put(s.getName(), s.getGpa());
					}
				});
				return studentMap;
				
			};
	
	public static void main(String[] args) {
System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateExample.p3));
	}

}
