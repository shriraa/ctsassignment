package com.cts.serviceimpl;

import java.awt.List;

import com.cts.bean.Employee;
import com.cts.service.Employeeservice;

public class EmployeeServiceImpl implements Employeeservice{
	
	public List employeeList;
	@Override
	public Boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeList.add(emp);
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
	if(get(emp.getId()==null))
	{
		return false;
	}
	employeeList.get(emp);
	}

	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public List getAllEmployees(int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllEmployees(int minSalary, int maxSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
