package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> searchEmployee();

	public Employee updateEmployee(Long id,Employee employee);

	
	public Employee searchEmployeeById(Long id);

	public boolean deleteEmployee(Long id);
	

}
