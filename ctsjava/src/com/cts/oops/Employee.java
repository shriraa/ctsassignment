package com.cts.oops;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String address;
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	} 
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println();
		
	}
	
	@Override
	public int hashCode() {
		final int prime =31;
		int result = 1;
		result = prime * result + id;
		result = prime * result +((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass());
			return false;	
	}
}

			
			
	