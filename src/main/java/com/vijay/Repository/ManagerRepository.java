package com.vijay.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vijay.model.Employee;
import com.vijay.model.Manager;
import com.vijay.service.EmpService;


@Repository
public class ManagerRepository {

	
	@Autowired
	private EmpService empService;
	
	HashMap<UUID,Manager> managerDB;

	public ManagerRepository() {
		
		this.managerDB = new HashMap<>();
	}
	
	public void addManager(Manager m) {
		managerDB.put(m.getmID(), m);
	}
	
	public void addEmployee(UUID eId, UUID m) {
		managerDB.get(m).getEmps().add(empService.getEmployee(eId));
	}
	
	public Manager getMng(UUID mId) {
		return managerDB.get(mId);
	}
	
	public List<Manager> getAllManager(){
		List<Manager> list = new ArrayList<>();
		
		
		for(UUID mId : managerDB.keySet()) {
			list.add(managerDB.get(mId));
		}
		
		return list;
		
	}
	
	
}
