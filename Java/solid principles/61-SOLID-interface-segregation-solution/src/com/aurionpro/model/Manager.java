package com.aurionpro.model;

public class Manager implements IWorkable, IEatable{

	@Override
	public void startWork() {
		System.out.println("Manager has started working");

	}

	@Override
	public void stopWork() {
		System.out.println("Manager has stopped working");

	}

	@Override
	public void startEat() {
		System.out.println("Manager has started eating");

	}

	@Override
	public void stopEat() {
		System.out.println("Manager has stopped eating");
	}

}
