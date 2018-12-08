
package com.xxl.core.innerclasses_10.controller;

public class GreenhouseController
{
    public static void main(String[] args)
    {
        GreenhouseControls gc = new GreenhouseControls();

        // Instead of hard-wiring. you cloud parse configuration infomation from a text file here:
        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(200),
            gc.new LightOff(400),
            gc.new LightOn(600),
            gc.new LightOff(800),
            gc.new ThermostatDay(1400)
        };

        gc.addEvent(gc.new Restart(2000, eventList));

        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));

        gc.run();
    }
}

