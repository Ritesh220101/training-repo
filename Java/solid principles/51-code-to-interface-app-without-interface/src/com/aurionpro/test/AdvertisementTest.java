package com.aurionpro.test;

import com.aurionpro.model.Advertisement;

import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement adv = new Advertisement();
		Monitor mon = new Monitor();
		adv.showAdvertisement(mon);

		Projector pro = new Projector();
		adv.showAdvertisement(pro);

		Television tv = new Television();
		adv.showAdvertisement(tv);

	}

}
