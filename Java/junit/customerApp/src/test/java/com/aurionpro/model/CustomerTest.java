package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomerTest {
	Product product1 = new Product(1, "pepsi", 100, 0.1f);
	Product product2 = new Product(2,"redbull",200,0.2f);
	LineItem lineItem1 = new LineItem(1, 2, product1);
	LineItem lineItem2 = new LineItem(2,5,product2);
	Order order = new Order(1, "19/08/2022");
	Customer customer = new Customer(1, "ritz");
	
	@Test
	void testCalculatePriceAfterDiscount() {
		double expected = 90;
		double actual = Math.ceil(product1.calculatePriceAfterDiscount());
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateLineItemCost() {
		double expected = 180;
		double actual = Math.ceil(lineItem1.calculateLineItemCost());
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateOrderPrice() {
		order.addLineItem(lineItem1);
		order.addLineItem(lineItem2);
		double expected = 980;
		double actual = Math.ceil(order.calculateOrderPrice());
		assertEquals(expected, actual);
	}
	

}
