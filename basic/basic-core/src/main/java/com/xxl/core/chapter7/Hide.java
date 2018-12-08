package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Homer {
	char doh(char c) {
		print("doh(char)");
		return 'd';
	}
	float doh(float f) {
		print("doh(float)");
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {
		print("doh(Milhouse)");
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart bart = new Bart();
		bart.doh(1);
		bart.doh('a');
		bart.doh(1.0f);
		bart.doh(new Milhouse());
	}
}
