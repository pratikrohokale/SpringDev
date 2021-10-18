package com.infy.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart:setCourier(-)");
	}

	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}

	public void shopping(String[] items) {
		float billAmt = 0.0f;
		int oid = 0;

		Random rad = new Random();
		oid = rad.nextInt(2000);
		billAmt = items.length * 500;
		System.out.println("OrderId " + oid + " bill Amount is " + billAmt + " items are " + Arrays.toString(items));

		courier.deliver(oid);
	}

}
