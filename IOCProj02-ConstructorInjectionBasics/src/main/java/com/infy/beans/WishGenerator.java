package com.infy.beans;

import java.time.LocalDateTime;

public class WishGenerator {

	private LocalDateTime time;

	public WishGenerator() {
		System.out.println("WishGenerator() :: 0-param constructor");
	}

	public WishGenerator(LocalDateTime time) {
		this.time = time;
		System.out.println("WishGenerator() :: 1-param constructor");
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
		System.out.println("WishGenerator :: setTime(-)");
	}

	public String generateWishMsg() {

		Integer hour = time.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good afternoon";
		else if (hour < 20)
			return "Good evening";
		else
			return "Good Night";
	}
}
