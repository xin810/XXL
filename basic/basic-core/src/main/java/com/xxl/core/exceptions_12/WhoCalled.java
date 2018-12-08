
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

public class WhoCalled
{
    static void f()
    {
        // Generate an exception to fill in the stack trace
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {
            for (StackTraceElement ste : e.getStackTrace())
            {
                Print.print(ste.getMethodName() + "(); Lines: " + ste.getLineNumber());
            }
        }
    }

    static void g()
    {
        f();
    }

    static void h()
    {
        g();
    }

    public static void main(String[] args)
    {
        f();
        Print.print("------------------------------");
        g();
        Print.print("------------------------------");
        h();
    }
}

