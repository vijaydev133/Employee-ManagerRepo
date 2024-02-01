package com.vijay.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.model.Employee;
import com.vijay.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmpService emp;
	
	@PostMapping("/addEmp")
	public String addEmployee(@RequestBody Employee e) {
		
		e.seteId(UUID.randomUUID());
		emp.addEmployee(e);
		
		return "Employee Added Successfully";
	}
	
	
	@GetMapping("/getEmpById/{eId}")
	public Employee getEmployee(@PathVariable UUID eId) {
		return emp.getEmployee(eId);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return emp.getAllEmployee();
		
	}
}
