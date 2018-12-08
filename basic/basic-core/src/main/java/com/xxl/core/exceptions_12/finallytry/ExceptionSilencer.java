
package com.xxl.core.exceptions_12.finallytry;

public class ExceptionSilencer
{
    public static void main(String[] args)
    {
        try
        {
            throw new RuntimeException();
        }
        finally
        {
            // Using 'return' inside the finally block will silence any throw exception.
            return;
        }
    }
}

