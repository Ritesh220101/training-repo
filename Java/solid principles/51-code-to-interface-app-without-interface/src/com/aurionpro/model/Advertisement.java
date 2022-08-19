package com.aurionpro.model;

public class Advertisement {
	
	
	public void showAdvertisement(Monitor mon) {
		mon.display();
	}
	public void showAdvertisement(Television tv) {
		tv.display();
	}
	public void showAdvertisement(Projector pro) {
		pro.display();
	}
}
