package com.wangto.designPatterns.observer;

public class ObserverA extends Observer {
	
	public ObserverA(Subject subject) {
		subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("ObserverA updated");
	}

}
