package com.infy.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/home.htm")
	public ModelAndView process() {

		return new ModelAndView("welcome", "sysDate", LocalDateTime.now());
	}

}
