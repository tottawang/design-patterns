package com.wangto.designPatterns.proxy;

public class Test {
	
	public static void main(String[] args) {
		Shape shape = new ConcreteShapeProxy();
		shape.draw();
	}
	
}
