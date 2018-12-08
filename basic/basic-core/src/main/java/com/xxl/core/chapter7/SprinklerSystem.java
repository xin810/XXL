package com.xxl.core.chapter7;

public class SprinklerSystem {
	private String valvel, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	@Override
    public String toString() {
		return "valve1 = " + valvel + " " + "valve2 = " + valve2 + " " + "valve3 = " + valve3 + " " + "valve4 = "
				+ valve4 + "\n" + "i = " + i + " " + "f = " + f + " " + "source = " + source;
	}

	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem);
	}
}

class WaterSource {
	private String string;

	WaterSource() {
		System.out.println("WaterSource()");
		string = "Constructed";
	}

	@Override
    public String toString() {
		return string;
	}
}
