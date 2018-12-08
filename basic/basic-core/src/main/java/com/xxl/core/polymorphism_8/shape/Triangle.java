package com.xxl.core.polymorphism_8.shape;

import static com.xxl.util.Print.print;

public class Triangle extends Shape {
	@Override
    public void draw() {print("Triangle.draw()");}
	@Override
    public void erase() {print("Triangle.erase()");}
}
