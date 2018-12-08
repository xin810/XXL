
package com.xxl.core.exceptions_12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest
{
    private static final Logger LOG = Logger.getLogger(LoggerTest.class.getSimpleName());

    public static void main(String[] args)
    {
        LOG.severe("001");
        LOG.info("002 {}");
        LOG.log(Level.SEVERE, "0000");
    }
}

