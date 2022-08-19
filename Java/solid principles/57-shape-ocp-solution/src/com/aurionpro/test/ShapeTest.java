package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Shape(new Rectangle(10, 20));
		System.out.println(s1.getArea());

		Shape s2 = new Shape(new Circle(10));
		System.out.println(s2.getArea());

	}
}
