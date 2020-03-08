package com.infy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.infy.service.WishService;

public class WishController extends AbstractController {

	private WishService service;

	public void setService(WishService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = null;
		String wishMsg = null;
		wishMsg = service.generateWishMsg();
		mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wishMSG", wishMsg);
		return mav;
	}

}
