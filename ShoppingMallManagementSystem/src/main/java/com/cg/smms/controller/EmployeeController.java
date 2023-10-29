package com.cg.smms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.smms.entities.Employee;
import com.cg.smms.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return employeeService.searchEmployee();
    }
    
	@GetMapping("/employees/{id}")
	public Employee searchEmployeeById(@PathVariable("id") Long employeeId)
    {
		return employeeService.searchEmployeeById(employeeId);
    }

	@DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "The employee is deleted. Renew if needed.";
    }
    
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") Long employeeId,
                                       @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId,employee);
    }
    
}