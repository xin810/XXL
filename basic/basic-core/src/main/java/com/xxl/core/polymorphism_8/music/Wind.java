package com.xxl.core.polymorphism_8.music;

import static com.xxl.util.Print.print;

public class Wind extends Instrument {
	@Override
    public void play(Note n) {
		print("Wind.play() " + n);
	}
}

class Stringed extends Instrument {
	@Override
    public void play(Note n) {
		print("Stringed.play() " + n);
	}
}

class Brass extends Instrument {
	@Override
    public void play(Note n) {
		print("Brass.play() " + n);
	}
}
