package com.wangto.designPatterns.proxy;

public class ConcreteShape implements Shape {
	
	public ConcreteShape() {
		
	}
	
	@Override
	public void draw() {
		System.out.println("concrete shape is drawing..");
	}
	
}
