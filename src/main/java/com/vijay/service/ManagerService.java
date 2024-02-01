package com.vijay.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.Repository.ManagerRepository;
import com.vijay.model.Employee;
import com.vijay.model.Manager;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository mngRepo;
	
	
	public void addManager(Manager m) {
		mngRepo.addManager(m);
	}
	
	public void addEmployee(UUID e, UUID m) {
		mngRepo.addEmployee(e, m);
	}
	
	public Manager getManager(UUID id) {
		return mngRepo.getMng(id);
	}
	
	public List<Manager> getAllManager(){
		
		return mngRepo.getAllManager();
	}
}
