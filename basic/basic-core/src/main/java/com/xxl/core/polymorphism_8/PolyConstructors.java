package com.xxl.core.polymorphism_8;

import static com.xxl.util.Print.print;

class Glyph {
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
	void draw() {print("Glyph.draw()"); }
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int i) {
		radius = i;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	@Override
    void draw() {print("RoundGlyph.draw(), radius = " + radius);}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
