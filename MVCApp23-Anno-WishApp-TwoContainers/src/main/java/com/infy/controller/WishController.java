package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infy.service.WishService;

@Controller
public class WishController {

	@Autowired
	private WishService wishService;

	@RequestMapping("/result.htm")
	public ModelAndView process() {
		return new ModelAndView("result", "wishMsg", wishService.generateWishMessage());
	}

}
