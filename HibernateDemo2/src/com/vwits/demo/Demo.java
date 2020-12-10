package com.vwits.demo;

public class Demo {

	public static void main(String[] args) {
		AddressDAO adr=new AddressDAO();
		Address a1=new Address(1, "Pune", 411028);
		Address a2=new Address(2, "Mumbai", 400001);
		Address a3=new Address(3, "Delhi", 123456);
		Address a4=new Address(4, "Pune", 411001);
		Address a5=new Address(5, "Nagpur", 987654);
		
	adr.update(a1);
	adr.update(a2);
	adr.update(a3);
	adr.update(a4);
	adr.update(a5);
		
		
		System.out.println(adr.getAll());
		
	}
}
