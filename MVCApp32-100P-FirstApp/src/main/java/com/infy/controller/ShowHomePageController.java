package com.infy.controller;

import java.time.LocalTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomePageController {

	@RequestMapping("/home.htm")
	public String showHome(Map<String, Object> map) {
		map.put("sysDate", LocalTime.now());
		return "welcome";

	}
}
