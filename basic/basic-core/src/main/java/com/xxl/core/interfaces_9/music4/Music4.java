package com.xxl.core.interfaces_9.music4;

import static com.xxl.util.Print.print;

import com.xxl.core.polymorphism_8.music.Note;

/**
 * 抽象能力
 * @author xxl
 *
 */
abstract class Instrument {
	private int i; // Storage allocated for each.

	public abstract void play(Note n);

	public String what() {return "Instrument";}

	public abstract void adjust();
}

class Wind extends Instrument
{
	@Override
	public String what() {
		return "Wind";
	}

	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public void adjust() {

	}

	@Override
    public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument
{
	@Override
	public String what() {
		return "Percussion";
	}

	@Override
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	@Override
	public void adjust() {

	}
}

class Stringed extends Instrument
{
	@Override
	public String what() {
		return "Stringed";
	}

	@Override
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	@Override
	public void adjust() {

	}

}

class Brass extends Wind
{
	@Override
	public void play(Note n) {
		print("Brass.play() " + n);
	}

	@Override
	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind
{
	@Override
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	@Override
	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
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
