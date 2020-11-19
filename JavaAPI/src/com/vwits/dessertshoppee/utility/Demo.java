package com.vwits.dessertshoppee.utility;

import com.vwits.dessertshoppee.Candy;
import com.vwits.dessertshoppee.Cookie;
import com.vwits.dessertshoppee.DessertItem;
import com.vwits.dessertshoppee.IceCream;
import com.vwits.dessertshoppee.Sundae;

public class Demo {
	public static void main(String[] args) {
		Candy candy = new Candy("Orange Candy", 250);
		Cookie cookie = new Cookie("Coconut Cookie", 6);
		IceCream iceCream = new IceCream("Vanilla Icecream");
		Sundae sundae = new Sundae("Vanilla with Cherry");

		DessertItem items[] = { sundae, iceCream, cookie, candy };
		Checkout c = new Checkout();
		c.addItems(items);
		c.clearCart();
		System.out.println(c);
	}

}
