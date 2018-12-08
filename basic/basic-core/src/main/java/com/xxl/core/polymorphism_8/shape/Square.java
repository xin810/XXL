package com.xxl.core.polymorphism_8.shape;

import static com.xxl.util.Print.print;

public class Square extends Shape {
	@Override
    public void draw() {print("Square.draw()");}
	@Override
    public void erase() {print("Square.erase()");}
}
