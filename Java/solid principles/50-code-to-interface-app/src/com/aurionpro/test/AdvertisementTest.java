package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.IDisplayable;
import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement adv = new Advertisement();
		IDisplayable mon = new Monitor();
		adv.setDis(mon);
		adv.showAdvertisement();

		IDisplayable pro = new Projector();
		adv.setDis(pro);
		adv.showAdvertisement();

		IDisplayable tv = new Television();
		adv.setDis(tv);
		adv.showAdvertisement();

	}

}
