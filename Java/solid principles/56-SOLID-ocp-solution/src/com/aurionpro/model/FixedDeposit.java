package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private IInterest festInterest;

	public FixedDeposit(String name, double principal, int duration, IInterest festInterest) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festInterest = festInterest;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public IInterest getFestInterest() {
		return festInterest;
	}

	public double calculateSimpleInterest() {
		return (principal * duration * festInterest.getInterest()) / 100;
	}

}
