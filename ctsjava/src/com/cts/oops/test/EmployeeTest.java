package com.cts.oops.test;

import com.cts.oops.Address;
import com.cts.oops.ContractEmployee;
import com.cts.oops.Employee;

public class EmployeeTest {
	
	public static void displayDuration(ContractEmployee obj) {
    System.out.println(obj.getId());
	System.out.println(obj.getName());
	System.out.println(obj.getSalary());
	System.out.println(obj.getDuration());
		
	}
	public static void main(String[] args) {
	Employee emp;
	Address adres;
		// Mandatory Field
	emp= new Employee(101);
	emp.setName("shriraam");
	emp.setSalary(27000);
	emp.display();
	//Getter Setter
	emp.setId(102);
	emp.setName("raina");
	emp.setSalary(20000);
	emp.display();
	//ContractEmployee extends Employee
    //emp=new ContractEmployee(111);
	ContractEmployee obj=new ContractEmployee(0);
	obj.setName("Antony");
	obj.setDuration(1);
	obj.setSalary(10000);
	EmployeeTest.displayDuration(obj);
	//Object comparison
	Employee obj1 = new Employee(111);
	Employee obj2 = new Employee(111);
	System.out.println(obj1.equals(obj2));
	//Display Class  name and Fields
	System.out.println(emp);
	//Address Class Extends Employee 
	adres=new Address();
	adres.setCity("Chennai");
	adres.setPincode(600019);
	adres.setStreet("Thiruvottiyur");
	emp.setAdress(adres);
	System.out.println(emp.getAdress());
    
   }
}

