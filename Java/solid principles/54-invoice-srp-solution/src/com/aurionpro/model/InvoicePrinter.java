package com.aurionpro.model;

public class InvoicePrinter {

	public void printInvoice(Invoice in) {
		System.out.println("Id: " + in.getId());
		System.out.println("Description: " + in.getDescription());
		System.out.println("Amount: " + in.getAmount());
		System.out.println("Tax: " + in.getTax());
		System.out.println("DiscountPercent: " + in.getDiscountPercent());
		System.out.println("Total amount: "+in.calculateTotal());
	}
}
