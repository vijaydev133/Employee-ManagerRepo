package com.vijay.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.vijay.model.Employee;
import com.vijay.model.Manager;


@Repository
public class EmployeeRepository {

	
	HashMap<UUID, Employee> empDB;

	public EmployeeRepository() {
		
		this.empDB = new HashMap<>();
	}
	
	public void addEmployee(Employee e) {
		empDB.put(e.geteId(), e);
	}
	
	public Employee getEmployee(UUID eId) {
		return empDB.get(eId);
	}
	
	public List<Employee> getAllEmployee() {
List<Employee> list = new ArrayList<>();
		
		
		for(UUID mId : empDB.keySet()) {
			list.add(empDB.get(mId));
		}
		
		return list;
	}
	
	
	
	
	
	
}
