package com.cts.service;

import java.awt.List;

import com.cts.bean.Employee;

public interface Employeeservice {
		
	public boolean save(Employee emp);

	public boolean update(Employee emp);

	public boolean delete(int id);

	public Employee get(int id);

	public List<Employee> get();

	public void display(Employee emp);

	public void display(List<Employee> empList)

}
