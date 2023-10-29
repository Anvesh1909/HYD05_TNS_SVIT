package com.cg.smms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.smms.entities.Employee;

@Repository
public interface IEmployeeRepository  extends JpaRepository<Employee, Long> {

}
