package com.aurionpro.model;

public class Shape {
	private IShape shape;

	public Shape(IShape shape) {
		super();
		this.shape = shape;
	}

	public IShape getShape() {
		return shape;
	}
	
	public double getArea() {
		return shape.calculateArea();
	}
}
