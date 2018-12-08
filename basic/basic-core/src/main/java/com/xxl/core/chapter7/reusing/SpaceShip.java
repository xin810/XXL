package com.xxl.core.chapter7.reusing;

import static com.xxl.util.Print.print;

public class SpaceShip extends SpaceShipControls {
	private String name;

	public SpaceShip(String name) { this.name = name; }

	@Override
    public String toString() {
		return name;
	}

	public static void main(String[] args) {
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(100);
		print(protector);
	}
}
