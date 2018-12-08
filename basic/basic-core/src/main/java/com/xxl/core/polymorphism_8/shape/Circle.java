package com.xxl.core.polymorphism_8.shape;

import static com.xxl.util.Print.print;

public class Circle extends Shape {
	@Override
	public void draw() {print("Circle.draw()");}
	@Override
    public void erase() {print("Circle.erase()");}
}
