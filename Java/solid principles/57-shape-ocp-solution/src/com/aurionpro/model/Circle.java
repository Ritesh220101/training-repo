package com.aurionpro.model;

public class Circle implements IShape {
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

}
