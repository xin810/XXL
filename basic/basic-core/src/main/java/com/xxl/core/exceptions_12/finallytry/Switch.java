
package com.xxl.core.exceptions_12.finallytry;

import com.xxl.util.Print;

public class Switch
{
    private boolean state = false;

    public boolean read()
    {
        return state;
    }

    public void on()
    {
        state = true;
        Print.print(this);
    }

    public void off()
    {
        state = false;
        Print.print(this);
    }

    @Override
    public String toString()
    {
        return state ? "on" : "off";
    }
}

