package com.cts.service;

import java.util.List;

import com.cts.bean.Employee;
import com.cts.Exception.DuplicateUserException;

public interface EmployeService {

	// create
	public boolean save(Employee emp) throws DuplicateUserException;
	// update
	public boolean update(Employee emp);
	// delete
	public boolean delete(int id);
	// get
	public Employee get(int id);
	// get all
	public List<Employee> get();

	public void display(Employee emp);

	public void display(List<Employee> empList);
	//get all employees whose salary between min and max
    public List<Employee> get (int min,int max);
  //get all employees whose salary greater than Some Amount
    public List<Employee> getemployeeGreaterAmount (int amount);
   
}
