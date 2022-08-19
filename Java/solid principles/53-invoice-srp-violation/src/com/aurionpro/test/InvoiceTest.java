package com.aurionpro.test;

import com.aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice("101", "random-stuff", 100, 10, 5);
		System.out.println(in);
		in.printInvoice();
	}

}
