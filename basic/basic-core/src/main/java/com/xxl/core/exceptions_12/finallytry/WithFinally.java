
package com.xxl.core.exceptions_12.finallytry;

import com.xxl.util.Print;

public class WithFinally
{
    private static Switch sw = new Switch();

    public static void main(String[] args)
    {
        try
        {
            sw.on();
            // Code that can throw exceptions ...
            OnOffSwitch.f();
        }
        catch (OnOffException1 e)
        {
            Print.print("OnOffException1");
        }
        catch (OnOffException2 e)
        {
            Print.print("OnOffException2");
        }
        finally
        {
            sw.off();
        }
    }
}

