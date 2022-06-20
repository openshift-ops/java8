package com.java8.basics.lambda;

import java.util.Comparator;

import com.java8.basics.nonfinterface.ChildNonFunctionalInterface;
import com.java8.basics.nonfinterface.NonFunctionalInterface;

public class LambdaRunnableExample {
	
	
	public static void main(String [] args)
	{
		//As Runnable is a functional interface , prior to Java 8 we can implement Runnable using 
		//anonymous inner class that is nested class with no name
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside runnable 1");
				
			}
		};
		
		new Thread(runnable).start();
		
		//After the introduction of lambdas we can use them to implement functional interface
		//Functional interface are those which are optionally annotated with @FuntionalInterface
		//or have one single abstract method.
		//(input) -> {method body};
		//For single statements we dont need curly braces
		Runnable runnable1 = () -> {
			System.out.println("Inside Runnable 2");
			};
			
			new Thread(runnable1).start();
	
	
	Runnable runnable3 = () -> System.out.println("Inside Runnable 3");
	new Thread(runnable3).start();
	
	
	new Thread(() -> System.out.println("Inside runnable 4")).start();
	
	
	
}

}
