package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class LSPTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		System.out.println(rect.calculateArea());

		Square sq = new Square(10);
		System.out.println(sq.calculateArea());
	}

}
