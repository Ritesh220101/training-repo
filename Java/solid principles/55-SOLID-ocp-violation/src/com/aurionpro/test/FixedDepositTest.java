package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("ritz", 10000, 3, FestivalType.NEWYEAR);
		System.out.println(fd1.calculateSimpleInterest());

		FixedDeposit fd2 = new FixedDeposit("zitr", 20000, 1, FestivalType.OTHER);
		System.out.println(fd2.calculateSimpleInterest());

		FixedDeposit fd3 = new FixedDeposit("jtipt", 40000, 5, FestivalType.CHRISTMAS);
		System.out.println(fd3.calculateSimpleInterest());

		FixedDeposit fd4 = new FixedDeposit("catou", 50000, 2, FestivalType.EID);
		System.out.println(fd4.calculateSimpleInterest());

		FixedDeposit fd5 = new FixedDeposit("tpitj", 60000, 4, FestivalType.DIWALI);
		System.out.println(fd5.calculateSimpleInterest());
	}

}
