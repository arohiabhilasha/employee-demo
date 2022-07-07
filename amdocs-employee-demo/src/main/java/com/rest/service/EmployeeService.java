package com.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rest.entity.Employee;

@Service
public interface EmployeeService extends JpaRepository<Employee, Long>{
	
}

