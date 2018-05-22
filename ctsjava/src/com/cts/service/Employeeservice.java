package com.cts.service;

import java.awt.List;

import com.cts.bean.Employee;

public interface Employeeservice {
		
	public Boolean addEmployee(Employee emp);
		
	public Employee getEmployee(int id);
		
	public List getAllEmployees();
		
	public List getAllEmployees(int salary);
		
	public List getAllEmployees(int minSalary, int maxSalary);
	
	public Boolean deleteEmployee(int id);

	public Boolean updateEmployee(Employee emp);


}
