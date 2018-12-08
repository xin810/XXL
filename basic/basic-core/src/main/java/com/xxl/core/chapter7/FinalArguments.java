package com.xxl.core.chapter7;

class Gizmo {
	public void spin() {}
}

public class FinalArguments {
	void with(final Gizmo g) {
		//! g = new Gizmo(); // Illegal -- g is final
	}
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}
	//! void f(final int i) {i++; } // Can't change
	int g(final int i) {return i + 1; }

	public static void main(String[] args) {
		FinalArguments fa = new FinalArguments();
		fa.with(null);
		fa.without(null);
	}
}
