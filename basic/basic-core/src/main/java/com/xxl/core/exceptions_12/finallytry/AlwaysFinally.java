
package com.xxl.core.exceptions_12.finallytry;

import com.xxl.util.Print;

class FourException extends Exception
{

}

public class AlwaysFinally
{
    public static void main(String[] args)
    {
        Print.print("Entering first try block");
        try
        {
            Print.print("Entering second try block");
            try
            {
                throw new FourException();
            }
            finally
            {
                Print.print("finally in 2nd try block");
            }
        }
        catch (FourException e)
        {
            Print.print("Caught FourException in 1st try block");
        }
        finally
        {
            Print.print("finally in 1st try block");
        }
    }
}

