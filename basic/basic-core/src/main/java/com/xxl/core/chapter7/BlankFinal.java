package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Poppet {
	private int i;
	Poppet(int ii) { i = ii; }
	@Override
    public String toString() {return "" + i; }
}

public class BlankFinal {
	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet poppet; // Blank final reference
	// Blank finals MUST be initialize in the constructor:
	public BlankFinal() {
		j = 1; // Initialized blank final
		poppet = new Poppet(1);// Initialized blank final reference
	}
	public BlankFinal(int x) {
		j = x;
		poppet = new Poppet(x);
	}

	public static void main(String[] args) {
		BlankFinal bf1 = new BlankFinal();
		BlankFinal bf2 = new BlankFinal(47);
		print("i = " + bf1.i + "; " + "j = " + bf1.j + "; " + "Poppet: " + bf1.poppet.toString());
		print("i = " + bf2.i + "; " + "j = " + bf2.j + "; " + "Poppet: " + bf2.poppet.toString());
	}
}
