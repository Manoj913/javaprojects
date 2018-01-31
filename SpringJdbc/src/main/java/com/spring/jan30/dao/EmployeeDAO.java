package com.spring.jan30.dao;

import java.util.List;

import com.spring.jan30.pojo.Employee;

public interface EmployeeDAO {
	public void saveEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Integer ID);
	public Employee getEmployee(Integer ID);
	public List<Employee> getAllEmployees();

}
