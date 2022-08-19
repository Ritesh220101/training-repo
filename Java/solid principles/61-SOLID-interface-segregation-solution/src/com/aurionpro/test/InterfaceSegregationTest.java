package com.aurionpro.test;

import com.aurionpro.model.IEatable;
import com.aurionpro.model.IWorkable;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class InterfaceSegregationTest {

	public static void main(String[] args) {
		Manager manager = new Manager();
		atTheWork(manager);
		atTheCanteen(manager);

		Robot robot = new Robot();
		atTheWork(robot);
	}

	private static void atTheWork(IWorkable iwo) {
		iwo.startWork();
		iwo.stopWork();

	}

	private static void atTheCanteen(IEatable iwo) {
		iwo.startEat();
		iwo.stopEat();

	}

}
