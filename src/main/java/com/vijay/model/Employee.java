package com.vijay.model;

import java.util.UUID;

public class Employee {
	
	private UUID eId;

	private String name;
	
	private int age;
	
	private UUID managerId;

	public Employee(UUID eId, String name, int age, UUID managerId) {
		super();
		this.eId = eId;
		this.name = name;
		this.age = age;
		this.managerId = managerId;
	}

	public UUID geteId() {
		return eId;
	}

	public void seteId(UUID eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UUID getManagerId() {
		return managerId;
	}

	public void setManagerId(UUID managerId) {
		this.managerId = managerId;
	}
	
	
	
	
}
