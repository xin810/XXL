package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Plate {
	Plate(int i) {
		print("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		print("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		print("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife constructor");
	}
}

// A cultural way of doing something:
class Custom {
	Custom(int i) {
		print("Custom constructor");
	}
}

public class PlaceSetting extends Custom {
	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate dinnerPlate;

	public PlaceSetting(int i) {
		super(i + 1);

		spoon = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		dinnerPlate = new DinnerPlate(i + 5);
	}

	public static void main(String[] args) {
		PlaceSetting pSetting = new PlaceSetting(9);
	}
}
