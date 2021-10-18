package com.infy.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}

	@Override
	public void deliver(int orderId) {
		System.out.println(orderId + " order delivered:BlueDart");
	}

}
