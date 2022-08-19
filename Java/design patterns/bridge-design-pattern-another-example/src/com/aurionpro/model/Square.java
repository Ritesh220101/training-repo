package com.aurionpro.model;

public class Square extends Shape {

	public Square(IDraw draw) {
		super(draw);
	}

	@Override
	public String drawing() {
		return "Square is"+draw.fill();
	}

}
