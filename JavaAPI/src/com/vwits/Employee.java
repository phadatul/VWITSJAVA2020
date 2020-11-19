package com.vwits;

public class Employee {
	private int empid;
	private String ename;
	private int salary;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, int salary, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.empid == e.empid)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {

		return this.empid;
	}

}
