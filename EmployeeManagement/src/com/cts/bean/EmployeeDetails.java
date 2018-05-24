package com.cts.bean;

public class EmployeeDetails {
	private int Id, Salery;
	private String Name;
	private String Department;

	public EmployeeDetails(int Id, String Name, int Salery) {
		this.Id = Id;
		this.Name = Name;
		this.Salery = Salery;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSalery() {
		return Salery;
	}

	public void setSalery(int salery) {
		Salery = salery;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

}
