package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

	public static void main(String[] args) {
		//Order 1
		Product product1 = new Product(101, "sprite", 100, 0.1f);
		Product product2 = new Product(102, "dark-fantasy", 30, 0.2f);
		Product product3 = new Product(103, "oil", 200, 0.5f);

		Order order1 = new Order(101, "12-08-2022");
		order1.addLineItem(new LineItem(product1.getId(), 5, product1));
		order1.addLineItem(new LineItem(product2.getId(), 10, product2));
		order1.addLineItem(new LineItem(product3.getId(), 5, product3));
		
		
		//Order 2
		Product product4 = new Product(104, "pepsi", 100, 0.2f);
		Product product5 = new Product(105, "corn-flakes", 300, 0.1f);
		
		
		Order order2 = new Order(102, "12-08-2022");
		order2.addLineItem(new LineItem(product4.getId(), 3, product4));
		order2.addLineItem(new LineItem(product5.getId(), 10, product5));
		

		Customer customer = new Customer(1, "ritz");
		customer.addOrder(order1);

		customer.addOrder(order2);
		System.out.println(customer.getOrders());
		
		List<Order> orders = customer.getOrders();
		
		double totalPriceOfOrders = 0;
		for(Order o:orders) {
			totalPriceOfOrders+=o.calculateOrderPrice();
		}
		
		System.out.println("Number of orders: "+customer.getOrderCount());
		System.out.println("Total price of orders: "+Math.ceil(totalPriceOfOrders));
		
	
	}

}
