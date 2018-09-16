package com.wangto.designPatterns.observer;

public class ObserverB extends Observer {
	
	public ObserverB(Subject subject) {
		subject.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("ObserverB updated");
	}

}
