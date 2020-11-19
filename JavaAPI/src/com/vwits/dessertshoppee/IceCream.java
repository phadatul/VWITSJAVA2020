package com.vwits.dessertshoppee;

public class IceCream extends DessertItem{
	private double price_unit;
	
	

	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IceCream(String name) {
		super(name);
		this.price_unit=50;
	}



	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.price_unit;
	}

}
