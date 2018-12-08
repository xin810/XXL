
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

class MyException extends Exception
{
    public MyException() {}

    public MyException(String msg)
    {
        super(msg);
    }
}

public class FullConstructors
{
    public static void f() throws MyException
    {
        Print.print("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException
    {
        Print.print("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args)
    {
        try
        {
            f();
        }
        catch (MyException e)
        {
            e.printStackTrace(System.err); // System.out
        }

        try
        {
            g();
        }
        catch (MyException e)
        {
            e.printStackTrace(System.err);
        }
    }
}

