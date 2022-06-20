package com.java8.basics.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeDatabase {

	
	
	
	public static List<Employee> getAllEmployee()
	{
		Employee emp1 = new Employee("Bishesh", 200.0);
		Employee emp2 = new Employee("Nihar", 10.0);
		
		Employee emp3 = new Employee("Ankit", 500.0);
		Employee emp4 = new Employee("Biswa", 400.0);
		
		Employee emp5 = new Employee("Reema", 700.0);
		Employee emp6 = new Employee("Sweta", 900.0);
		
		return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
	}
}
