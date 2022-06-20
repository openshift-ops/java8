package com.java8.basics.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.java8.basics.data.Employee;
import com.java8.basics.data.EmployeeDatabase;
import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class LambdaComparableExample {
	
   public static void main(String[] args) {

	   
	   //prior to java 1.8 
	   Comparator<Integer> comparator = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	};
	
	System.out.println(comparator.compare(2, 3));
	
	
	//Using lambda
	
	Comparator<Integer> comparator2 = (a,b) -> a.compareTo(b);
	
	System.out.println(comparator2.compare(3, 4));
	BinaryOperator<Integer> binaryOperator = (a,b) -> a.compareTo(b);
	
	BinaryOperator<Double> binary = BinaryOperator.maxBy((a,b) -> a.compareTo(b));
	//Integer anything = binary.apply(2, 3);
	
	List<Employee> employeeList = EmployeeDatabase.getAllEmployee();
	
	
	Comparator<Employee> empComparator = (s1,s2) -> s1.getSalary().compareTo(s2.getSalary());
	
	
	
	List<Employee> sortedList = employeeList.stream().sorted(empComparator.reversed()).collect(Collectors.toList());
	
	
	
	sortedList.forEach((emp) -> System.out.println(emp.getName()));
	
	
	
	
	Map<String, Student> studentMap = StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

	System.out.println("Student Map : " + studentMap);
	
	
	Comparator<Student> c6 = (s1,s2) -> Double.compare(s1.getGpa(), s2.getGpa());
	
	String s = studentMap.entrySet().stream().max((o1,o2) -> Double.compare(o1.getValue().getGpa(), o2.getValue().getGpa())).get().getKey();
	
	System.out.println(s);
	
	
	Comparator<Map.Entry<String, Student>> c7 =  (o1,o2) -> Double.compare(o1.getValue().getGpa(), o2.getValue().getGpa());
	TreeMap<Object, Object> sortedMap = studentMap.entrySet().stream().sorted(c7).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,throwingMerger(),TreeMap::new));
	System.out.println(sortedMap);
	
	
}
   
   private static <T> BinaryOperator<T> throwingMerger() {
       return (u,v) -> { throw new IllegalStateException(String.format("Duplicate key %s", u)); };
   }

}
