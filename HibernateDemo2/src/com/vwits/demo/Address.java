package com.vwits.demo;

public class Address {
	private int addressid;
	private String city;
	private int zipcode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addressid, String city, int zipcode) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.zipcode = zipcode;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "[addressid=" + addressid + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressid;
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
		Address other = (Address) obj;
		if (addressid != other.addressid)
			return false;
		return true;
	}
	
	
	
	
}
