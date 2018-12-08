
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

public class Rethrowing
{
    public static void f() throws Exception
    {
        Print.print("originating the exception in f()");
        throw new Exception("throw from f()");
    }

    public static void g() throws Exception
    {
        try
        {
            f();
        }
        catch (Exception e)
        {
            Print.print("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception
    {
        try
        {
            f();
        }
        catch (Exception e)
        {
            Print.print("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args)
    {
        try
        {
            g();
        }
        catch (Exception e)
        {
            Print.print("main: printStacktrace()");
            e.printStackTrace(System.out);
        }
        Print.print("-------------------------------------------");
        try
        {
            h();
        }
        catch (Exception e)
        {
            Print.print("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

