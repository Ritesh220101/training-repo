package com.aurionpro.model;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercent;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	private double calculateTax() {
		return (amount * tax) / 100;
	}

	private double calculateDiscount() {
		return (amount * discountPercent) / 100;
	}

	double calculateTotal() {
		return amount + calculateTax() - calculateDiscount();
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void printInvoice() {
		System.out.println("Id: " + id);
		System.out.println("Description: " + description);
		System.out.println("Amount: " + amount);
		System.out.println("Tax: " + calculateTax());
		System.out.println("DiscountPercent: " + calculateDiscount());
		System.out.println("Total amount: " + calculateTotal());
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax
				+ ", discountPercent=" + discountPercent + "]";
	}

}
