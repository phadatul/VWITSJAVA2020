package com.vwits.dessertshoppee.utility;

import com.vwits.dessertshoppee.DessertItem;

public class Checkout {
	private DessertItem cashRegister[];

	public void addItems(DessertItem[] items) {
		this.cashRegister = items;
	}

	public void clearCart() {
		this.cashRegister = null;
		System.err.println("CART IS EMPTY!!!!!!");
	}

	public int getNoOfItems() {
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return 0;
		} else {
			return cashRegister.length;
		}
	}

	public double getTotalCost() {
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return 0;
		} else {
			double ans = 0;
			for (DessertItem i : cashRegister) {
				ans = ans + i.getCost();
			}
			return ans;
		}
	}

	@Override
	public String toString() {
		String s = "";

		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return s;
		} else {

			for (DessertItem i : cashRegister) {
				s = s + i.getName() + "::" + i.getCost() + "\n";
			}
			s = s + "TOTAL::" + this.getTotalCost();
			return s;
		}
	}

}
