package com.infy.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishServiceImpl implements WishService {

	public String generateWishMessage() {
		{
			int hour = 0;
			String message = null;

			hour = LocalTime.now().getHour();

			if (hour < 12)
				message = "Good morning";
			else if (hour < 16)
				message = "Good afternoon ";
			else if (hour < 20)
				message = "Good evening";
			else
				message = "Good night";

			return message;

		}
	}

}
