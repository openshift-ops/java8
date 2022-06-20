package com.java8.basics.data;

public class Employee {

	
	private String name;
	private Double salary;
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
