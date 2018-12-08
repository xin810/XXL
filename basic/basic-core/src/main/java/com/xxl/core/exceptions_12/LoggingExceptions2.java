
package com.xxl.core.exceptions_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import com.xxl.util.Print;

public class LoggingExceptions2
{
    private static Logger logger = Logger.getLogger(LoggingExceptions2.class.getSimpleName());

    static void logException(Exception e)
    {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args)
    {
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            logException(e);

            Print.printErr("Caught: " + e);
        }
    }
}

