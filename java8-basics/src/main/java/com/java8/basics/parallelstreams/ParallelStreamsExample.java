package com.java8.basics.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
	
	//Parallel streasm splits the source data into multiple parts
	//Process them aprallely
	//Combine and gives the result
	
	//thread -safe as well as multiple threads can access the object
	
	public static long calclulatePerformance(Supplier<Integer> supplier,int n)
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<n;i++)
		{
			supplier.get(); //Multiple threads are creatd because of the fork/join framework introduced in the java 7
			                //the no of threads is equal to the no .of processors in the machine
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	public static int sequesntialStream()
	{
		return IntStream.rangeClosed(0, 5).sequential().peek((s) -> System.out.println("Sequesntial Thread :" + s +  " : " + Thread.activeCount())).sum();
	}
	
	public static int parallelStream()
	{
		return IntStream.rangeClosed(0, 5).parallel().//Splits the data set into multiple parts and assigns it to multiple processors and then will perform the operation parallelely
				peek((s) -> System.out.println("Parallel Thread :" + s +  " : " + Thread.activeCount())).sum();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.out.println("Sequesntial stream : " + calclulatePerformance(ParallelStreamsExample::sequesntialStream, 2));
		System.out.println("Parallel stream : " + calclulatePerformance(ParallelStreamsExample::parallelStream, 2));

	}

}
