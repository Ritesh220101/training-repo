package com.aurionpro.test;

import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalculator;

public class TaxCalulatorTest {

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator(LogType.FILE);
		System.out.println(tc.calculateTax(1000, 0.1));	
	}

}
