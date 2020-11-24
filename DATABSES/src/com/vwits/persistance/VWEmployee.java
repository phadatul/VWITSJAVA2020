package com.vwits.persistance;

public class VWEmployee {
	private int empid, salary;
	private String firsetName, lastName, city, state;

	public VWEmployee() {
		// TODO Auto-generated constructor stub
	}

	public VWEmployee(int empid, int salary, String firsetName, String lastName, String city, String state) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.firsetName = firsetName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirsetName() {
		return firsetName;
	}

	public void setFirsetName(String firsetName) {
		this.firsetName = firsetName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", salary=" + salary + ", firsetName=" + firsetName + ", lastName="
				+ lastName + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VWEmployee other = (VWEmployee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	

}
