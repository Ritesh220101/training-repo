package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class InterfaceSegregationTest {

	public static void main(String[] args) {
		IWorker manager = new Manager();
		atTheWork(manager);
		atTheCanteen(manager);

		IWorker robot = new Robot();
		atTheWork(robot);
		atTheCanteen(robot);
	}

	private static void atTheWork(IWorker iwo) {
		iwo.startWork();
		iwo.stopWork();

	}

	private static void atTheCanteen(IWorker iwo) {
		iwo.startEat();
		iwo.stopEat();

	}

}
