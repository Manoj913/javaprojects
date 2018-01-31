package com.spring.jan30.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.jan30.pojo.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {
	private String INSERT = "insert into Employee values(?,?,?,?)";
	private String UPDATE = "update Employee set first_name=?,last_name=?,salary=? where id=?";
	private String DELETE = "delete from Employee where id=?";
	private String GET = "select * from Employee where id=?";
	private String GETALL = "select * from Employee";

	public void saveEmployee(Employee e) {
		getJdbcTemplate().update(INSERT,new Object[]{e.getID(),e.getFirtsName(),e.getLastName(),e.getSalary()});
		
	}

	public void updateEmployee(Employee e) {
		getJdbcTemplate().update(UPDATE,new Object[]{e.getFirtsName(),e.getLastName(),e.getSalary(),e.getID()});
		
	}

	public void deleteEmployee(Integer ID) {
		getJdbcTemplate().update(DELETE,new Object[]{ID});
		
	}

	public Employee getEmployee(Integer ID) {
		List<Employee> emp = getJdbcTemplate().query(GET, new Object[]{ID}, new EmployeeRowMapper());
		return emp.get(0);
	}

	public List<Employee> getAllEmployees() {
		List<Employee> emp = getJdbcTemplate().query(GETALL, new EmployeeRowMapper());
		return emp;
	}

}

class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee();
		e.setID(rs.getInt("id"));
		e.setFirtsName(rs.getString("first_name"));
		e.setLastName(rs.getString("last_name"));
		e.setSalary(rs.getInt("salary"));
		return e;
	}
	
}