package com.cts.serviceimpl;

import java.util.*;

import com.cts.bean.Department;
import com.cts.bean.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeService;

public class DepartmentServiceHashMapImpl implements DepartmentService {
	private Map<Integer, Department> departmentmap; 
	private EmployeService empservice;
	public DepartmentServiceHashMapImpl(EmployeService empservice) {
		this.empservice = empservice;
		
	}

	@Override
	public boolean add(Department department) {
		
			if (departmentmap.containsKey(department.getId())) {
				return false;
			}
			departmentmap.put(department.getId(), department);
			return true;
	}

	@Override
	public boolean update(Department department) {
		if (departmentmap.containsKey(department.getId())) {
			
			departmentmap.put(department.getId(), department);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		if (departmentmap.containsKey(id)) {
			departmentmap.remove(id);
			return true;
		}
		return false;
	}

	@Override
	public Department get(int id) {
		
		if (departmentmap.containsKey(id)) {
		return	departmentmap.get(id);
		}
		return null;
	}

	@Override
	public List<Department> get() {

		return new ArrayList<Department><? extends Department>)departmentmap.values());

	}

	@Override
	public boolean addEmployetoDepartment(int empId, int deptId) {
		Employee emp=empservice.get(empId);
		Department dept=get(deptId);
		if(emp==null||dept==null)
		{
			return false;
		}
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		if(empList==null)
		{
			empList = new ArrayList<Employee>();
		}
		empList.add(emp);
		dept.setEmplist(empList);
		departmentmap.put(deptId, dept);
		return true;

	}

	@Override
	public boolean remove(int empId, int deptId) {
		Employee emp=empservice.get(empId); 	
		Department dept=get(deptId);	
		if(emp==null||dept==null)
		{
			return false;		
		}
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		if(empList==null)
		{
			empList = new ArrayList<Employee>();
		}
		empList.remove(emp);		
		dept.setEmplist(empList);
		return true;
	}

	@Override
	public List<Employee> getEmployesinParticularDepartment(int deptId) {
		if(!departmentmap.containsKey(deptId))
			return null;
		List<Employee> empList=get(deptId).getEmplist();
		return empList;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int amount) {
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		List<Employee> salaryList=new ArrayList<Employee>();
		if(empList==null)
			return null;
		for(Employee emp:empList)
		{
			if(emp.getSalary()==amount) 
			 salaryList.add(emp); 				
		}
		
		return salaryList; 
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) {
		List<Employee> empList=getEmployesinParticularDepartment(deptId);
		List<Employee> salaryList=new ArrayList<Employee>();
		if(empList==null)
			return null;
		for(Employee emp:empList)
		{
			if(emp.getSalary()>=min&&emp.getSalary()<=max) 
			 salaryList.add(emp);
			 		
		}
		return salaryList;
	}

	@Override
	public void display(List<Department> deptList) {
		for (Department dept : deptList) {
			display(dept);
		}}
		public void display(Department dept) {
			System.out.println(departmentmap.get(dept.getId()));
		}
}

