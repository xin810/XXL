package com.xxl.core.interfaces_9;

interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {

	public int f(int i) {
		return 1;
	}

	public void f() {

	}

}

class C3 extends C implements I2 {

	public int f(int i) {
		return 1;
	}

	@Override
	public int f() {
		return 1;
	}

}

class C4 extends C implements I3 {
	@Override
	public int f() {
		return 1;
	}
}

// ! class C5 extends C implements I1 {}
// ! interface I4 extends I1, I3 {}

public class InterfaceCollision {

}
