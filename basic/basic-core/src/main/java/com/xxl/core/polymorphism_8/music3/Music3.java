package com.xxl.core.polymorphism_8.music3;

import static com.xxl.util.Print.print;

import com.xxl.core.polymorphism_8.music.Note;

class Instrument {
	void play(Note n) {print("Instrument.play() " + n);}
	String whate() {return "Instrument";}
	void adjust() {print("Adjusting Instrument");}
}

class Wind extends Instrument {
	void play(Note n) {print("Wind.play() " + n);}
	@Override
    String whate() {return "Wind";}
	@Override
    void adjust() {print("Adjusting Wind");}
}

class Percussion extends Instrument {
	void play(Note n) {print("Percussion.play() " + n);}
	@Override
    String whate() {return "Percussion";}
	@Override
    void adjust() {print("Adjusting Percussion");}
}

class Stringed extends Instrument {
	void play(Note n) {print("Stringed.play() " + n);}
	@Override
    String whate() {return "Stringed";}
	@Override
    void adjust() {print("Adjusting Stringed");}
}

class Brass extends Wind {
	void play(Note n) {print("Brass.play() " + n);}
	@Override
    void adjust() {print("Adjusting Brass");}
}

class Woodwind extends Wind {
	void play(Note n) {print("Woodwind.play() " + n);}
	@Override
    String whate() {return "Woodwind";}
}

public class Music3 {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
		i.adjust();
	}
	public static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		// Upcasting during addition to the arrary:
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};

		tuneAll(orchestra);
	}
}
