
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

public class ExceptionMethods
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exception("My Exception");
        }
        catch (Exception e)
        {
            Print.print("Caught Exception:");
            Print.print("getMessage():" + e.getMessage());
            Print.print("getLocalizedMessage():" + e.getLocalizedMessage());
            Print.print("toString():" + e.toString());
            Print.print("printStackTrace():" + e.getStackTrace());
        }
    }
}

