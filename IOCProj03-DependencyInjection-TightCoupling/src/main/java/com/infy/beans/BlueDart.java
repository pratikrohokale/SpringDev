package com.infy.beans;

public class BlueDart {

	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}

	public void deliver(int orderId) {
		System.out.println(orderId + " order delivered:BlueDart");
	}

}
