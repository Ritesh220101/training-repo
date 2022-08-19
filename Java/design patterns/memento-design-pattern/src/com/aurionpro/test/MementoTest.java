package com.aurionpro.test;

import com.aurionpro.model.CareTaker;
import com.aurionpro.model.Originator;

public class MementoTest {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State 1");
		careTaker.add(originator.saveStateToMomento());
		originator.setState("State 2");
		careTaker.add(originator.saveStateToMomento());
		originator.setState("State 3");
		careTaker.add(originator.saveStateToMomento());
		originator.setState("State 4");
		
		System.out.println("Current State: "+originator.getState());
		
		originator.getStateFromMomento(careTaker.get(0));
		System.out.println("First saved state: "+originator.getState());
		
		originator.getStateFromMomento(careTaker.get(1));
		System.out.println("Second saved state: "+originator.getState());
		
		originator.getStateFromMomento(careTaker.get(2));
		originator.setState("Updated State 3");
		System.out.println("Third saved state: "+originator.getState());
		
	}

}
