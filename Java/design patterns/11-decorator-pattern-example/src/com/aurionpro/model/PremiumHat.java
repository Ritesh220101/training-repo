package com.aurionpro.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public String getDescription() {
		return "Flashy and to pricy";
	}

	@Override
	public double getPrice() {
		return 1000;
	}

}
