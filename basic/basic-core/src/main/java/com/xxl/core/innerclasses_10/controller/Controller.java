
package com.xxl.core.innerclasses_10.controller;

import java.util.ArrayList;
import java.util.List;

import com.xxl.util.Print;

public class Controller
{
    // A class from java.util to hold Event object:
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event event)
    {
        eventList.add(event);
        Print.print(event.getClass().getSimpleName() +  " - size is: " + eventList.size());
    }

    public void run()
    {
        while (eventList.size() > 0)
            // make a copy so you're not modifying the list while you're selecting the elements in it:
            for (Event e : new ArrayList<Event>(eventList))
            {
                if (e.ready())
                {
                    Print.print(e);
                    e.action();
                    eventList.remove(e);
                }
            }
    }
}

