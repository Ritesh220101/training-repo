package com.aurionpro.test;

import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class DisplayTest {

	public static void main(String[] args) {
		Monitor mon = new Monitor();
		Projector pro = new Projector();
		Television tel = new Television();
		displayToDevice(mon);
		displayToDevice(pro);
		displayToDevice(tel);

	}

	private static void displayToDevice(Monitor mon) {
		mon.display();

	}

	private static void displayToDevice(Projector pro) {
		pro.display();

	}

	private static void displayToDevice(Television tel) {
		tel.display();

	}

}
