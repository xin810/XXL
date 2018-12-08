package com.xxl.core.polymorphism_8.music;

public class Music
{
    public static void tune(Instrument i)
    {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args)
    {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
