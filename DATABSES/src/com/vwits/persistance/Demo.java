package com.vwits.persistance;

public class Demo {
	public static void main(String[] args) {
		VWEmpRepo repo = new VWEmpRepo();

		VWEmployee emp = new VWEmployee(7, 99, "james", "bond", "Pune", "Maharashtra");
		System.out.println(repo.getAll());


		System.out.println(repo.getAll());
		emp = new VWEmployee(7, 99, "James", "Bond", "Mumbai", "Maharashtra");
		repo.updateEmployee(emp);
		System.out.println(repo.getAll());
	}

}
