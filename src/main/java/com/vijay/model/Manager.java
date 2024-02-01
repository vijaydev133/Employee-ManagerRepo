package com.vijay.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Manager {

	
	private UUID mID;
	
	private String name;
	
	private int age;
	
	private List<Employee> emps;

	public Manager(UUID mID, String name, int age, List<Employee> emps) {
//		super();
		this.mID = mID;
		this.name = name;
		this.age = age;
		this.emps = new ArrayList<>();
	}

	public UUID getmID() {
		return mID;
	}

	public void setmID(UUID mID) {
		this.mID = mID;
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

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = new ArrayList<>();
	}
	
	
}
