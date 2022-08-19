package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}

	private double getInterestRates() {
		if (festival == FestivalType.DIWALI)
			return 7.5;
		if (festival == FestivalType.CHRISTMAS)
			return 6.5;
		if (festival == FestivalType.EID)
			return 7;
		if (festival == FestivalType.NEWYEAR)
			return 8;
		return 6;
	}

	public double calculateSimpleInterest() {
		return (principal * duration * getInterestRates()) / 100;

	}
}
