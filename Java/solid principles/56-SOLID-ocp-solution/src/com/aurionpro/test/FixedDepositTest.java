package com.aurionpro.test;

import com.aurionpro.model.Christmas;
import com.aurionpro.model.Diwali;
import com.aurionpro.model.Eid;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.Holi;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("ritz", 10000, 2, new Diwali());
		System.out.println(fd1.calculateSimpleInterest());
		
		FixedDeposit fd2 = new FixedDeposit("zitr", 20000, 3, new Eid());
		System.out.println(fd2.calculateSimpleInterest());
		
		FixedDeposit fd3 = new FixedDeposit("jtipt", 30000, 4, new Christmas());
		System.out.println(fd3.calculateSimpleInterest());
		
		FixedDeposit fd4 = new FixedDeposit("tpitj", 40000, 5, new Holi());
		System.out.println(fd4.calculateSimpleInterest());
	}

}
