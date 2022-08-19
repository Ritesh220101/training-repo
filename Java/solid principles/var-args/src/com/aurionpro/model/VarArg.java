package com.aurionpro.model;

public class VarArg {
	public void print(int... values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		System.out.println("Sum: "+sum);
	}
}
