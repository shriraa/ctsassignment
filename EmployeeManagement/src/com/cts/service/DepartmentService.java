package com.cts.service;

import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.Employee;

public interface DepartmentService {
	// add new Department
	public boolean add(Department department);
    //Update the department
	public boolean update(Department department);
    //Delete the Department
	public boolean delete(int id);
    //Get The Particular Department
	public Department get(int id);
    //Get List of all Department
	public List<Department> get();
	// add Employee to Department
	public boolean addEmployetoDepartment(int empId, int deptId);
    //Remove Employee to Department
	public boolean remove(int empId, int deptId);
	// get all employes of Particular Department
	public List<Employee> getEmployesinParticularDepartment(int deptId);

	// get all Employees Salary Greater than Some amount also range
	// in particular Department
	public List<Employee> getEmployees(int deptId, int amount);

	// get all Employees Salary Greater than Some amount also range
	// in particular Department
	public List<Employee> getEmployees(int deptId, int min, int max);
    //Display the Department List
	public void display(List<Department> deptList);



}
