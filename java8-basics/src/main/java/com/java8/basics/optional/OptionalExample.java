package com.java8.basics.optional;

import java.util.Optional;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class OptionalExample {
	
	
	public static String getStudentName()
	{
		Student student = StudentDatabase.supplier.get();
		
		if(student != null)
		{
			return student.getName();
		}
		return null;
	}
	
	public static Optional<String> getStudentNameOptional()
	{
		 Optional<Student> student = Optional.ofNullable(StudentDatabase.supplier.get());
		
		if(student.isPresent())
		{
			return student.map(Student::getName); //It returns Optional<String>..If the name is null it returns optional.empty
		}
		return Optional.empty();
	}
	
	
	
	public static void main(String[] args) {
		
		
//		String name = getStudentName();
//		
//		if(name != null)
//		{
//			System.out.println("Length of the name " + name.length());
//		}
//		else
//		{
//			System.out.println("Name is not found");
//		}

		
		//In the above code so many null checks have been performed and that too we are retuning null if the student is not found and we can't do any method call on the null
		//without having a null check
		
		
		//wWith optional object now we dont have to do null checks as we can just check if the object is present inside optional or not and we can do method calls on the optional object
		//as it will not null
		
		Optional<String> studentName = getStudentNameOptional();
		
		if(studentName.isPresent())
		{
			System.out.println("Length of the name " + studentName.get().length());
		}
		else
		{
			System.out.println("Name is not found");
		}
	}

}
