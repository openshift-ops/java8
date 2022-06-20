package com.java8.basics.parallelstreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class ParallelStreamsExample1 {
	

	public static void sequqntialGetActivities()
	{
		long startTime = System.currentTimeMillis();
		
		 StudentDatabase.getAllStudents()
				.stream()
				.peek((s) -> System.out.println("First ops :" + Thread.currentThread().getName() + " " + Thread.activeCount()))
				.map(Student::getActivities)
				.peek((s) -> System.out.println("Second ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.flatMap(List::stream)
				.peek((s) -> System.out.println("Third ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.sorted()
				.peek((s) -> System.out.println("Fourth ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.distinct()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
	
	public static void parallelGetActivities()
	{
		long startTime = System.currentTimeMillis();
		
		 StudentDatabase.getAllStudents()
				.stream()
				.parallel()
				.peek((s) -> System.out.println("First ops :" + Thread.currentThread().getName() + " " + Thread.activeCount()))
				.map(Student::getActivities)
				.peek((s) -> System.out.println("Second ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.flatMap(List::stream)
				.peek((s) -> System.out.println("Third ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.sorted()
				.peek((s) -> System.out.println("Fourth ops :" +Thread.currentThread().getName() + " " + Thread.activeCount()))
				.distinct()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		sequqntialGetActivities();
		parallelGetActivities();

	}

}
