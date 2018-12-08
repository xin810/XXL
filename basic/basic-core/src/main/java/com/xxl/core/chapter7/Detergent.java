package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	@Override
    public String toString() { return s; }

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		print(x);
	}
}

public class Detergent extends Cleanser {
	// Change a method:
	@Override
    public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() { append(" foam()"); }

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
