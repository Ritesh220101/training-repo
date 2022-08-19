package com.aurionpro.model;

public class Department {
	IWorking role;

	public Department(IWorking role) {
		super();
		this.role = role;
	}

	public void work() {
		role.working();
	}
}
