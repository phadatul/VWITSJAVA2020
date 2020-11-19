package com.vwits.dessertshoppee;

public class Candy extends DessertItem {

	private double weight_gms, price_kg;

	public Candy(String name, double weight_gms) {
		super(name);
		this.weight_gms = weight_gms;
		this.price_kg=100;
	}

	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (this.price_kg / 1000) * this.weight_gms;
	}

}
