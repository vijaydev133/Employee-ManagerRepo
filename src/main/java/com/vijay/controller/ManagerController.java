package com.vijay.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.model.Employee;
import com.vijay.model.Manager;
import com.vijay.service.ManagerService;

@RestController
@RequestMapping("/mng")
public class ManagerController {

	@Autowired
	private ManagerService mngService;
	
	
	@PostMapping("/addMng")
	public String addManager(@RequestBody Manager m) {
		
		
		m.setmID(UUID.randomUUID());
		
		mngService.addManager(m);
		
		return "Manager added successfully";
	}
	
	
	@PutMapping("/addEmp-Mng")
	public String addEmployeeUnderManager(@RequestParam UUID e,@RequestParam UUID m) {
		
		
		mngService.addEmployee(e, m);
		
		return "Employee Added under managerSuccessfully";
	}
	
	
	@GetMapping("/get-mg-by-id")
	public Manager getManager(@PathVariable UUID mId){ 
		
		
		return mngService.getManager(mId);
	}
	
	@GetMapping("/getAllMng")
	public List<Manager> getAllManager(){
		
		return mngService.getAllManager();
		
	}
	
}
