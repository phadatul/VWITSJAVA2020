package com.vwits.demo;

import lombok.Data;

public @Data class Address {
	
	private int addressid;
	private String city;
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid, String city, int pincode) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	

}
