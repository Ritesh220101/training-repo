package com.aurionpro.test;

import com.aurionpro.model.Department;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Manager;

public class DepartmentTest {

	public static void main(String[] args) {
		Department dep = new Department(new Manager());
		dep.work();
	}

}
