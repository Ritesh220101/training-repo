package com.aurionpro.model;

public class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW has started");
	}

	@Override
	public void stop() {
		System.out.println("BMW has stopped");
	}

}
