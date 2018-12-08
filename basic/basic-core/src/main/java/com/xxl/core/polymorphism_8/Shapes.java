package com.xxl.core.polymorphism_8;

import com.xxl.core.polymorphism_8.shape.RandomShapeGenerator;
import com.xxl.core.polymorphism_8.shape.Shape;

public class Shapes {
	private static RandomShapeGenerator generator = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++) {
			s[i] = generator.next();
		}

		for (Shape shape : s) {
			shape.draw();
		}
	}
}
