package com.java8.basics.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsvsStreams {

	
	public static void main(String[] args) {

		
		List<String> names = new ArrayList<>();
		
		names.add("Bishesh");
		names.add("Bhavna");
		
		
		for(String name : names)
		{
			System.out.println(name);
		}
		Stream<String> nameStream = names.stream();
		
		nameStream.forEach(System.out::println);
		nameStream.forEach(System.out::println); //Wrong as stream can be used only once as it is closed once operated
		
		
		//We cannot modify a stream.
	}
}
