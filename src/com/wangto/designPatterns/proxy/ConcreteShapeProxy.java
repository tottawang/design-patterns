package com.wangto.designPatterns.proxy;

public class ConcreteShapeProxy implements Shape {
	
	private Shape concreteShape;

	@Override
	public void draw() {
		if (concreteShape == null) {
			concreteShape = new ConcreteShape();
		}
		concreteShape.draw();
	}

}
