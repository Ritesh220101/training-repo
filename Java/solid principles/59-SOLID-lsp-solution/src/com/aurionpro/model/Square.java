package com.aurionpro.model;

public class Square implements IShape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

}
