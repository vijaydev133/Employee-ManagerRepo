package com.vijay.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.Repository.EmployeeRepository;
import com.vijay.model.Employee;


@Service
public class EmpService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public void addEmployee(Employee e) {
		empRepo.addEmployee(e);
	}
	
	public Employee getEmployee(UUID eId) {
		return empRepo.getEmployee(eId);
	}
	
	public List<Employee> getAllEmployee() {
		
		return empRepo.getAllEmployee();
	}
}
