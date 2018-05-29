package com.cts.Test;

import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.Employee;
import com.cts.Exception.DuplicateUserException;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeService;
import com.cts.serviceimpl.DepartmentServiceHashMapImpl;
import com.cts.serviceimpl.DepartmentServiceImpl;
import com.cts.serviceimpl.EmployeeServiceHashmapImpl;
import com.cts.serviceimpl.EmployeeServiceImpl;

public class DepartmentServiceTest {
	private static DepartmentService deptservice;
	private static EmployeService empservice;

	public static void init() {
		empservice = new EmployeeServiceHashmapImpl();
		deptservice = new DepartmentServiceHashMapImpl(empservice);
		Employee emp;
		emp = new Employee(101, "Saravanan", 2000);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp = new Employee(102, "Ramesh", 4000);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp = new Employee(103, "Sanjay", 6000);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Employes Added");

		Department dept;
		dept = new Department(1, "Maintanence");
		deptservice.add(dept);
		dept = new Department(2, "Production");
		deptservice.add(dept);
		System.out.println("Department Added");
	}

	public static void main(String[] args) {

		init();

		System.out.println("Display Particular Department");
		// Display Particular Department
		System.out.println(deptservice.get(1));
		System.out.println("Display All department");
		// Display All Department
		List<Department> deptList = deptservice.get();
		deptservice.display(deptList);

		// Add Employee to Dept
		System.out.println(deptservice.addEmployetoDepartment(101, 2));
		// Display Emp in Particular Dept
		System.out.println("Employee in Particular Department");
		System.out.println(deptservice.getEmployesinParticularDepartment(1));
		// deptservice.display();

		// Another Method To display All Department
		System.out.println(deptservice.get());
		// Add Employee to Dept
		System.out.println(deptservice.addEmployetoDepartment(102, 2));
		// Another Method To display All Department
		System.out.println(deptservice.get());
		// Remove That Employee in the Particular Department
		deptservice.remove(102, 2);
		// Another Method To display All Department
		System.out.println(deptservice.get());
		System.out.println("Display Employee List in Particuar Department Who will get greater than some Amount");
		
		 List<Employee> empLis1 = deptservice.getEmployees(2, 2000);
		 if(empLis1!=null)
		 empservice.display(empLis1);
		 else
			 System.out.println("No Records Found");
		 System.out.println("Display Employee List in Particuar Department Who will get max and min for some Amount");
		 List<Employee> empList1 = deptservice.getEmployees(3000, 6000);
		 if(empList1!=null)
		 empservice.display(empList1);
		 else
			 System.out.println("No Records Found");
		
		 
	}
}

