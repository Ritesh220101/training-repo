package com.aurionpro.model;

public class Square extends Rectangle {
	//private double side;

	public Square(double side) {
		super(side, side);
	}

	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setBreadth(length);
	}

	@Override
	public void setBreadth(double breadth) {
		super.setBreadth(breadth);
		super.setLength(breadth);
	}

}