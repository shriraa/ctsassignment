package com.cts.oops;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			{
			Employee e1=new Employee(1000);
			e1.setId(100);
			e1.setName("shriraam");
			e1.setSalary(10000);
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getSalary());
			Employee e2=new Employee(1000);
			e2.setId(1000);
			e2.setName("shriraam");
			e2.setSalary(10000);
			System.out.println(e2.getId());
			System.out.println(e2.getName());
			System.out.println(e2.getSalary());
			System.out.println(e1==e2);
			System.out.println(e1.equals(e2));
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());			
			ContractEmployee ce=new ContractEmployee();
			ce.setId(301);
			ce.setName("shriraam");
			ce.setSalary(5000);
			ce.setDuration(8);
			System.out.println(ce.getId());
			System.out.println(ce.getName());
			System.out.println(ce.getSalary());
			System.out.println(ce.getDuration());
			Address addr1=new Address();
			addr1.setStreet("4th Street");
			addr1.setCity("Chennai");
			addr1.setPincode(600091);
			Address addr2=new Address();
			addr2.setStreet("5th Street");
			addr2.setCity("Delhi");
			addr2.setPincode(100056);
			e1.setAddress(addr1);
			e2.setAddress(addr2);
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e1.equals(e2));
			
		}

	

	}

}
