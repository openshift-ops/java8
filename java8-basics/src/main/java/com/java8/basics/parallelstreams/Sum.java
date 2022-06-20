package com.java8.basics.parallelstreams;

public class Sum {

	
	
	private int total; //instance object

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void performSum(int number)
	{
		total+=number;
		//Object becomes mutable as it keep constatly changing
	}
}
