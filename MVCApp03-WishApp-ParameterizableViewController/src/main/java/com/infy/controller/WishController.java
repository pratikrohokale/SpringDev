package com.infy.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
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

		return new ModelAndView("result", "wishMsg", message);
	}

}
