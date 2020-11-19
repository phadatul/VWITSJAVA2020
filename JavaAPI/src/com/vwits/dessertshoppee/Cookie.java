package com.vwits.dessertshoppee;

public class Cookie extends DessertItem {

	private int no_of_units;
	private double price_dozen;

	public Cookie(String name, int no_of_units) {
		super(name);
		this.no_of_units = no_of_units;
		this.price_dozen = 120;
	}

	public Cookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (this.price_dozen/12)*this.no_of_units;
	}

}
