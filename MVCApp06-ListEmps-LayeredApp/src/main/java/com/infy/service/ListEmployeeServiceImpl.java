package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.infy.bo.EmployeeBO;
import com.infy.dao.ListEmployeeDAO;
import com.infy.dto.EmployeeDTO;

public class ListEmployeeServiceImpl implements ListEmployeeService {

	private ListEmployeeDAO dao;

	public void setDao(ListEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> getAllEmps() {
		List<EmployeeDTO> listDTO;
		List<EmployeeBO> listBO = null;
		listBO = dao.retriveEmployees();
		listDTO = new ArrayList<EmployeeDTO>();

		listBO.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});

		return listDTO;
	}

}
