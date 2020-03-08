package com.infy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.infy.dto.EmployeeDTO;
import com.infy.service.ListEmployeeService;

public class ListEmployeeController extends AbstractController {

	private ListEmployeeService service;

	public void setService(ListEmployeeService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<EmployeeDTO> listEmps = service.getAllEmps();
		return new ModelAndView("result", "emps", listEmps);
	}

}
