package com.aurionpro.model;

public class Printer {
	DelegationPrinter del = new DelegationPrinter();
	public void print() {
		del.print();
	}
}
