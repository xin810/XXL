package com.xxl.core.interfaces_9.music5;

import static com.xxl.util.Print.print;

import com.xxl.core.polymorphism_8.music.Note;

/**
 * 接口
 * @author xxl
 *
 */
interface Instrument {
	int VALUE = 5; // static & final

	void play(Note n); // Automatically public

	void adjust();
}

class Wind implements Instrument
{

	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Wind";
	}

}

class Percussion implements Instrument
{

	public void play(Note n) {
		print(this + ".play()" + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Percussion";
	}

}

class Stringed implements Instrument
{

	public void play(Note n) {
		print(this + ".play()" + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind
{
	@Override
	public void play(Note n) {
		print(this + ".play()****" + n);
	}

	@Override
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind
{
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class Music5
{
	static void tune(Instrument i)
	{
		// ...
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e)
	{
		for (Instrument i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
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
