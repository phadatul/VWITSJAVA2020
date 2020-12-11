package com.vwits.demo;

import java.util.Set;

import lombok.Data;

public @Data class Employee {
	
	private int empid;
	private String ename;
	private int salary;
	private Set<Address> addresses;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String ename, int salary, Set<Address> addresses) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.addresses = addresses;
	}
	
	
	
	
	

}
