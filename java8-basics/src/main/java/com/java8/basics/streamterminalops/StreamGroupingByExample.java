package com.java8.basics.streamterminalops;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamGroupingByExample {
	
	
	public static Map<String, List<Student>> groupByStudentByGender()
	{
		Map<String,List<Student>> genderMap =    StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGender));
		return genderMap;
	}
	
	public static Map<String, List<Student>> csutomizedGroupByStudentByGPA()
	{
		
//		Function<Student,String> func1 = (student) -> {
//			if(student.getGpa()>=3.9)
//			{
//				return "Outstanding";
//			}
//			return "Poor";
//		};
//		Map<String,List<Student>> genderMap =    StudentDatabase.getAllStudents().stream()
//		.collect(Collectors.groupingBy(func1));
		
		
		Map<String,List<Student>> genderMap =    StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy((student) -> student.getGpa() >=3.8? "Outsnading":"Poor"));
		return genderMap;
	}
	
	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy((student) -> student.getGpa()>=3.8 ? "Outstanding" : "Poor")));
	}
	
	public static Map<Integer, Integer> twoLevelGrouping_2()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNotebooks)));
	}
	
	public static Map<String, Integer> twoLevelGrouping_3()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNotebooks)));
	}
	
	public static Map<String, Integer> twoMap()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.toMap(Student::getName, Student::getNotebooks));
	}
	
	
	public static Map<String, List<Student>> twoLevelGrouping_4()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName, Collectors.toList()));
	}
	
	
	
	
	
	public static Map<Integer, Student> getTheTopGpaInEveryGrade()
	{
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional<Student>::get)));
	}
	
	public static Map<Integer, Student> getTheLeastGpaInEveryGrade()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional<Student>::get)));
	}
	
	
	public static Map<String, Set<Student>> threeArgument()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
	}

	
	public static void main(String[] args) {

		
//		System.out.println(groupByStudentByGender());
//		System.out.println(csutomizedGroupByStudentByGPA());
//		
//		System.out.println(twoLevelGrouping_1());
//		
//		System.out.println(twoLevelGrouping_2());
//		
//		System.out.println(twoLevelGrouping_3());
//		
//		System.out.println(twoLevelGrouping_4());
//		
//		System.out.println(twoMap());
//		
//		System.out.println(threeArgument());
		
		System.out.println(getTheLeastGpaInEveryGrade());
		System.out.println(getTheTopGpaInEveryGrade());
	}
}
