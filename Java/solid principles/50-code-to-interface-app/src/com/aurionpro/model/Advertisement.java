package com.aurionpro.model;

public class Advertisement {
	IDisplayable dis;

	public void setDis(IDisplayable dis) {
		this.dis = dis;
	}

	public void showAdvertisement() {
		dis.display();
	}
}
