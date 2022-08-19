package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class LSPTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		if (isRectangle(rect))
			System.out.println("Object is a rectangle");
		else
			System.out.println("Object is not a rectangle");

		Square sq = new Square(10);
		if (isRectangle(sq))
			System.out.println("Object is a rectangle");
		else
			System.out.println("Object is not a rectangle");

	}

	public static boolean isRectangle(Rectangle rect) {
		double before = rect.getBreadth();
		rect.setLength(50);
		double after = rect.getBreadth();
		return before == after;

	}
}