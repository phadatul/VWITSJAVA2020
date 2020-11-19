package com.vwits.dessertshoppee;

public abstract class DessertItem {
	private String name;

	public DessertItem() {
		// TODO Auto-generated constructor stub
	}

	public DessertItem(String name) {
		super();
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	public abstract double getCost();

}
