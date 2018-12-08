
package com.xxl.core.exceptions_12.finallytry;

import com.xxl.util.Print;

public class OnOffSwitch
{
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2
    {

    }

    public static void main(String[] args)
    {
        try
        {
            sw.on();
            // Code that can throw exceptions ...
            f();
            sw.off();
        }
        catch (OnOffException1 e)
        {
            Print.print("OnOffException1 " + e);
            sw.off();
        }
        catch (OnOffException2 e)
        {
            Print.print("OnOffException2");
            sw.off();
        }
    }
}

