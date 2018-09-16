package com.wangto.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void notifyAllObservers() {
		observers.stream().forEach(observer -> observer.update());	
	}
	
	
	
	

}
