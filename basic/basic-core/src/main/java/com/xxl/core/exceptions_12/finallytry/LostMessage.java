
package com.xxl.core.exceptions_12.finallytry;

import com.xxl.util.Print;

class VeryImportantException extends Exception
{
    @Override
    public String toString()
    {
        return "A very important exception!";
    }
}

class HoHumException extends Exception
{
    @Override
    public String toString()
    {
        return "A trivial exception";
    }
}

public class LostMessage
{
    void f() throws VeryImportantException
    {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException
    {
        throw new HoHumException();
    }

    public static void main(String[] args)
    {
        try
        {
            LostMessage lm = new LostMessage();
            try
            {
                lm.f();
            }
            finally
            {
                lm.dispose();
            }
        }
        catch (Exception e)
        {
            Print.print(e);
        }
    }
}

