package com.cts.bean;

import java.awt.List;

public class Department {
	 public int id;
	public String name;
	public List employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getEmployees() {
		return employees;
	}
	public void setEmployees(List employees) {
		this.employees = employees;
	}

}
