package com.infy.beans;

public class DTDC {
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}

	public void deliver(int orderId) {
		System.out.println(orderId + " order is delivered::DTDC");
	}
}
