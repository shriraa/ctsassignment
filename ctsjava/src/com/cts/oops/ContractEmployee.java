package com.cts.oops;

public class ContractEmployee extends Employee {
	public ContractEmployee(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}

