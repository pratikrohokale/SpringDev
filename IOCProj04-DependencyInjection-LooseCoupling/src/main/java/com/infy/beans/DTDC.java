package com.infy.beans;

public class DTDC implements Courier{
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}

	@Override
	public void deliver(int orderId) {
		System.out.println(orderId + " order is delivered::DTDC");
	}
}
