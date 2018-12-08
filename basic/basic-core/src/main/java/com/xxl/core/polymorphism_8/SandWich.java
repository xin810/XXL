package com.xxl.core.polymorphism_8;

import static com.xxl.util.Print.print;

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {print("Bread()"); }
}

class Cheese {
	Cheese() {print("Cheese()"); }
}

class Lettuce {
	Lettuce() {print("Lettuce()"); }
}

class Lunch extends Meal {
	Lunch() {print("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class SandWich extends PortableLunch {
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	public SandWich() {
		print("SandWich()");
	}

	public static void main(String[] args) {
		new SandWich();
	}
}
