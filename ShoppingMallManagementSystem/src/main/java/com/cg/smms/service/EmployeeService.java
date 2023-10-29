


package com.cg.smms.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	 private IEmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		 return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> searchEmployee() {
		  return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Long id,Employee employee) {
		  Employee empDB = employeeRepository.findById(id).get();

	       if(Objects.nonNull(employee.getName()) &&
	       !"".equalsIgnoreCase(employee.getName())) {
	           empDB.setName(employee.getName());
	       }
	       if(Objects.nonNull(employee.getDob()) &&
	    	       !"".equalsIgnoreCase(employee.getDob())) {
	    	           empDB.setDob(employee.getDob());
	   

	       if(Objects.nonNull(employee.getSalary()) &&
	    	       !"".equals(employee.getSalary())) {
	    	           empDB.setSalary(employee.getSalary());
	    	 }
	       if(Objects.nonNull(employee.getAddress()) &&
	    	       !"".equalsIgnoreCase(employee.getAddress())) {
	    	           empDB.setAddress(employee.getAddress());
	    	 }
	       if(Objects.nonNull(employee.getDesignation()) &&
	    	       !"".equalsIgnoreCase(employee.getDesignation())) {
	    	           empDB.setDesignation(employee.getDesignation());
	       }
	       if(Objects.nonNull(employee.getShop()) &&
	    	       !"".equalsIgnoreCase(employee.getShop())) {
	    	           empDB.setShop(employee.getShop());
	    	 }
	       }

	       return employeeRepository.save(empDB);
	}

	@Override
	public Employee searchEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public boolean deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);
		return false;
	}

}
