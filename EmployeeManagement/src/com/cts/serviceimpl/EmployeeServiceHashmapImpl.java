package com.cts.serviceimpl;

import java.util.*;

import com.cts.Exception.DuplicateUserException;
import com.cts.bean.Employee;
import com.cts.service.EmployeService;

public class EmployeeServiceHashmapImpl implements EmployeService {
	private Map employeemap;
	
	@Override
	public boolean save(Employee emp) {
		if (employeemap.containsKey(emp.getId())) {
			return false;
		}
		employeemap.put(emp.getId(), emp);
		return true;
	}

	@Override
	public boolean update(Employee emp) {
		if (employeemap.containsKey(emp.getId())) {
			employeemap.put(emp.getId(), emp);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		if (employeemap.containsKey(id)) {
			employeemap.remove(id);
			return true;
		}
		return false;
	}

	@Override
	public Employee get(int id) {
		if (employeemap.containsKey(id)) {
			return (Employee) employeemap.get(id);
		}
		return null;
	}

	@Override
	public List<Employee> get() {
		Collection<Employee> values = employeemap.values();
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>(values);
		return listOfEmployee;
	}

	@Override
	public void display(Employee emp) {
		System.out.println(employeemap.get(emp.getId()));
		

	}

	@Override
	public void display(List<Employee> empList) {
		for (Employee emp : empList) {
			display(emp);
		}

	}

	@Override
	public List<Employee> get(int min, int max) {
		
		Collection<Employee> employees = employeemap.values();
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>(employees);
		List<Employee> salaryList = new ArrayList<Employee>();
		for (Employee emp : listOfEmployees) {
			if (emp.getSalary() > min && emp.getSalary() < max) {
				salaryList.add(emp);
			}
		}
		return salaryList;
	}

	@Override
	public List<Employee> getemployeeGreaterAmount(int amount) {
		Collection<Employee> employees = employeemap.values();
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>(employees);
		List<Employee> salaryList = new ArrayList<Employee>();
		for (Employee emp : listOfEmployees) {
			if (emp.getSalary() > amount) {
				salaryList.add(emp);
			}
		}
		return salaryList;
	}

}

