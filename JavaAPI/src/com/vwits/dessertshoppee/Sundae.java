package com.vwits.dessertshoppee;

public class Sundae extends IceCream {
	private double price_toppings;

	public Sundae() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sundae(String name) {
		super(name);
		this.price_toppings = 15;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + this.price_toppings;
	}

}
