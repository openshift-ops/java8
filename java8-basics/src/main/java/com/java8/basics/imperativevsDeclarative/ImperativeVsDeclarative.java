package com.java8.basics.imperativevsDeclarative;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
	
	
	public static void main (String [] args)
	{
		//Imperative programming focuses on how to get to the result
		
		//step by step programming
		
		//follows classic oops structure
		
		//encorages to create mutable objects
		
		int sum = 0;
		for(int i = 0;i<=100;i++)
		{
			sum+=i;
			
		}
		System.out.println(sum);
		
		
		//Declarative programming focuses on what is the result
		
				//no need to worry about the business logic almost analogus to SQL
				
				//Functional programming follows declarative programming
				
				//encorages to create immutable objects which is much better if concurrency is involved
		
		//Concise and readable
		//Here functions and methods are treated as first class entities such as varaibles
		
		int sumD = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println(sumD);
		
		
		
		List<Integer>integerList = Arrays.asList(10,20,30,30,20,20,80,20,90,90,70);
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer: integerList)
		{
			if(!uniqueList.contains(integer))
			{
				uniqueList.add(integer);
			}
			
		}
		
		
		List<Integer> declariveList = integerList.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println("ImperativeList " + uniqueList + "\n" + "Declarative List " + declariveList );
		
		
	}
	
	
	

}
