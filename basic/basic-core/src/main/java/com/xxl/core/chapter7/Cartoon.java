package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;
import static com.xxl.util.Print.printb;

class Art {
	Art() { print("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
	public Cartoon() { printb("Cartoon constructor"); }

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}
