package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Shape {
	Shape(int i) { print("Shape constructor"); }
	void dispose() { print("Shape dispose"); }
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		print("Drawing Circle");
	}
	@Override
    void dispose() {
		print("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		print("Drawing Triangle");
	}
	@Override
    void dispose() {
		print("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + ", " + end);
	}
	@Override
    void dispose() {
		print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape {
	private Circle circle;
	private Triangle triangle;
	private Line[] lines = new Line[3];

	public CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j*j);
		circle = new Circle(1);
		triangle = new Triangle(1);
		print("Combined constructor");
	}

	@Override
    public void dispose() {
		print("CADSystem.dispose()");
		// The order of cleanup is the reverse
		// of the order of initializtion:
		circle.dispose();
		triangle.dispose();
		for (int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem xSystem = new CADSystem(47);
		try {
			// Code and exception handing...
		} finally {
			xSystem.dispose();
		}
	}
}
