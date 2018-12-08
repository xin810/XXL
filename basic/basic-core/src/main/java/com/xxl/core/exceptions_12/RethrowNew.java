
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

class OneException extends Exception
{
    public OneException(String s)
    {
        super(s);
    }
}

class TwoException extends Exception
{
    public TwoException(String s)
    {
        super(s);
    }
}

/**
 *
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author Administrator
 * @version [1.0.0, Administrator]
 */
public class RethrowNew
{
    public static void f() throws OneException
    {
        Print.print("originating the exception in f()");
        throw new OneException("throw from f()");
    }

    public static void main(String[] args)
    {
        try
        {
            try
            {
                f();
            }
            catch (OneException e)
            {
                Print.print("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        }
        catch (TwoException e)
        {
            Print.print("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

