package com.java8.basics.stream;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class StreamMapReduce {
	
	
	
	public static int findTotalNoOfNotebooks()
	{
		return StudentDatabase.getAllStudents().stream()
				.filter((s) -> s.getGpa()>=3.9)
				.filter((s) -> s.getGender().equals("female"))
		.map(Student::getNotebooks)
		.reduce(0,Integer::sum);
	}
	
	
public static void main(String[] args) {
	
	System.out.println(findTotalNoOfNotebooks());

}
}
