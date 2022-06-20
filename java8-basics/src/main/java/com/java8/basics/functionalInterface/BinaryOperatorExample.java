package com.java8.basics.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.java8.basics.data.Student;
import com.java8.basics.data.StudentDatabase;

public class BinaryOperatorExample {


	static BinaryOperator<Integer> binaryOps = (a,b) -> a*b; 
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	
	static BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
	
	
	static BinaryOperator<Integer> min = BinaryOperator.minBy(comparator);
	
	Supplier<List<Integer>> integerSupplier = () -> new ArrayList<>();
	
	 BinaryOperator<List<Integer>> binaryList = (s1,s2) -> {
		
		 List<Integer> intergers = integerSupplier.get();
		 intergers.addAll(s1);
		 intergers.addAll(s2);
		return intergers;
	};
	
	
	
	BiPredicate<List<Integer>, Integer> biPredicate = (s2 , a) -> s2.contains(a);
	
	 BinaryOperator<List<Integer>> binaryListCommon = (s1,s2) -> {
		
		 List<Integer> intergers = integerSupplier.get();
		 s1.forEach((a) -> {
			
			 if(biPredicate.test(s2,a))
			 {
				 intergers.add(a); 
			 }
		 });
		 return intergers.stream().distinct().toList();
	};
	
	//Comparator<Student> studentCompare = (s1,s2) -> Double.compare(s1.getGpa(), s2.getGpa());
	
	
	
	static Comparator<Student> studentCompare = Comparator.comparing(Student::getGpa);
	
	static Function<List<Student>,List<Student>> function = (s1) -> 
	{
		s1.sort(studentCompare);
		return s1;
	};
	
//	static Student s = null;
//	static BiFunction<List<Student>, Student,Optional<Student>> function2 = (s1,intialStudent) -> 
//	{
//		s= intialStudent;
//		s1.forEach((s2) -> {
//			
//			s = s.getGpa()> s2.getGpa() ? s : s2;
//			});
//		return Optional.of(s);
//	};
	
	
	static Student s = null;
	static Function<List<Student>,Student> function2 = (s1) -> 
	{
		s= s1.get(0);
		s1.forEach((s2) -> {
			
			s = s.getGpa()> s2.getGpa() ? s : s2;
			});
		return s;
	};
	
	BinaryOperator<List<Integer>> binaryListUnique = (s1,s2) -> {
		
		 List<Integer> intergers = integerSupplier.get();
		 s1.forEach((a) -> {
			
			 if(biPredicate.negate().test(s2,a))
			 {
				 intergers.add(a); 
			 }
		 });
		 return intergers.stream().distinct().toList();
	};
	
	
 public static void main(String[] args) {

	 Supplier<List<Integer>> s1 = () -> Arrays.asList(1,2,3,4,5,7,8,9,7);
		
	 Supplier<List<Integer>> s2 = () -> Arrays.asList(5,6,7,3,3,4);
	
	 
	 System.out.println(binaryOps.apply(4, 5));
	 
	 System.out.println(max.apply(4, 5));
	 
	 System.out.println(min.apply(4, 5));
	 
	 System.out.println(new BinaryOperatorExample().binaryList.apply(s1.get(), s2.get()));
	 
	 System.out.println(new BinaryOperatorExample().binaryListCommon.apply(s1.get(), s2.get()));
	 System.out.println(new BinaryOperatorExample().binaryListUnique.apply(s1.get(), s2.get()));
	 
	 
	System.out.println(function.apply(StudentDatabase.getAllStudents()));
	System.out.println(function2.apply(StudentDatabase.getAllStudents()));
	
	
	 
	 

}
	
	
}
