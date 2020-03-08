package com.infy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.infy.bo.EmployeeBO;

public class ListEmployeeDAOImpl implements ListEmployeeDAO {

	private static final String GET_ALL_EMPS = "SELECT ENO,ENAME,JOB,SAL FROM EMP";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> retriveEmployees() {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_ALL_EMPS, new EmpListRSE());
		return listBO;
	}

	private class EmpListRSE implements ResultSetExtractor<List<EmployeeBO>> {

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO = null;
			EmployeeBO bo = null;
			listBO = new ArrayList<EmployeeBO>();
			while (rs.next()) {
				bo = new EmployeeBO();
				bo.setEno(rs.getInt("ENO"));
				bo.setEname(rs.getString("ENAME"));
				bo.setDesg(rs.getString("JOB"));
				bo.setSalary(rs.getInt("SAL"));
				listBO.add(bo);
			}
			return listBO;
		}

	}

}
