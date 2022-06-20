package com.java8.basics.lambda;

import java.util.function.Consumer;

public class LambdaVariable {
	static int value = 9;
	
	public static void main(String[] args) {

		//int value = 0; //Local Variable
		
		
//		Consumer<Integer> c1 = (value) -> Not allowed as the i/p is the same name as the local variable
//		{
//			System.out.println(value + i);
//		};
		
//		Consumer<Integer> c1 = (i) -> 
//		{
//			int value =6;  //Not allowed to declare any variable with the same name as the local variable
//			System.out.println(value + i);
//		};
		
//		Consumer<Integer> c1 = (i) -> 
//		{
//			value++;   //Not allowed to change the value of the local variable inside or outside lambda
//			System.out.println(value + i);
//		};
		
		Consumer<Integer> c1 = (i) -> 
		{
			
			value++;   //Not allowed to change the value of the local variable inside or outside lambda
			System.out.println(value + i);
		};
		
		
	}

}
