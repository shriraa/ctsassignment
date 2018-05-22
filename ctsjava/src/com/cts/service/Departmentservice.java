package com.cts.service;

import java.awt.List;

public interface Departmentservice {
		
	public boolean addDepartment(Departmentservice dept);
		
	public Departmentservice Department (int id);
		
	public List getAllDepartments();
	    
	public boolean deleteDepartment(int id);   //cascade on delete?
	    
	public boolean updateDepartment(Departmentservice dept);
		
	public boolean addEmployeeToDepartment(int empID, int deptID);
		
	public boolean deleteEmployeeFromDepartment(int empID, int deptID);
		
	public List  getAllEmployees(int deptID);
}
