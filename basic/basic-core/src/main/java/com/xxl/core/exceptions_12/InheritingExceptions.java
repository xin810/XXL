
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

class SimpleException extends Exception
{
}

public class InheritingExceptions
{
    public void f() throws SimpleException
    {
        Print.print("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args)
    {
        InheritingExceptions inherE = new InheritingExceptions();

        try
        {
            inherE.f();
        }
        catch (SimpleException e)
        {
            Print.print("Caught it!");
        }
    }
}

