package com.wangto.designPatterns.observer;

public class Test {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		new ObserverA(subject);
		new ObserverB(subject);
		subject.setState("new state");
	}

}
