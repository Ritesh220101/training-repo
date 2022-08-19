package com.aurionpro.model;

public class Circle extends Shape {

	public Circle(IDraw draw) {
		super(draw);
	}

	@Override
	public void drawing() {
		draw.draw();
	}
	
}
