
package com.xxl.core.innerclasses_10.controller;

public class GreenhouseControls extends Controller
{
    private boolean light = false;

    public class LightOn extends Event
    {
        public LightOn(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware contrl code here to physically turn on the light.
            light = true;
        }

        @Override
        public String toString()
        {
            return "Light is on.";
        }
    }

    public class LightOff extends Event
    {
        public LightOff(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware contrl code here to physically turn off the light.
            light = false;
        }

        @Override
        public String toString()
        {
            return "Light is off.";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event
    {
        public WaterOn(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware control code here.
            water = true;
        }

        @Override
        public String toString()
        {
            return "Greenhouse water is on.";
        }
    }

    public class WaterOff extends Event
    {
        public WaterOff(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware control code here.
            water = false;
        }

        @Override
        public String toString()
        {
            return "Greenhouse water is off.";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event
    {
        public ThermostatNight(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware control code here.
            thermostat = "Night";
        }

        @Override
        public String toString()
        {
            return "Thermostat on night setting.";
        }
    }

    public class ThermostatDay extends Event
    {
        public ThermostatDay(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // Put hardware control code here.
            thermostat = "Day";
        }

        @Override
        public String toString()
        {
            return "Thermostat on day setting.";
        }
    }

    /**
     * An example of an action() that inserts a new one of itself into the event list
     * <一句话功能简述>
     * <功能详细描述>
     *
     * @author l
     * @version [1.0.0, l]
     */
    public class Bell extends Event
    {
        public Bell(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // TODO Auto-generated method stub
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString()
        {
            return "Bing!";
        }
    }

    public class Restart extends Event
    {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList)
        {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action()
        {
            for (Event e : eventList)
            {
                e.start(); // Rerun each event
                addEvent(e);
            }

            start(); // Rerun this event
            addEvent(this);
        }

        @Override
        public String toString()
        {
            return "Restarting system...";
        }
    }

    public static class Terminate extends Event
    {
        public Terminate(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action()
        {
            // TODO Auto-generated method stub
            System.exit(0);
        }

        @Override
        public String toString()
        {
            return "Terminating...";
        }
    }
}

