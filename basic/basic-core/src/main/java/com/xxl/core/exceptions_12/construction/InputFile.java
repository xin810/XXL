
package com.xxl.core.exceptions_12.construction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.xxl.util.Print;

public class InputFile
{
    private BufferedReader in;

    public InputFile(String fname) throws Exception
    {
        try
        {
            in = new BufferedReader(new FileReader(fname));
            // Other code that might throw exceptions
        }
        catch (FileNotFoundException e)
        {
            Print.print("Could not open " + fname);
            // Was't open, so don't close it
            throw e;
        }
        catch (Exception e)
        {
            // All other exceptions must close it
            try
            {
                in.close();
            }
            catch (IOException e2)
            {
                Print.print("in.close() unsuccessful");
            }
            throw e; // Rethrow
        }
        finally
        {
            // Don't close it here!!!
        }
    }

    public String getLine()
    {
        String s;
        try
        {
            s = in.readLine();
        }
        catch (IOException e)
        {
            throw new RuntimeException("readline() failed");
        }
        return s;
    }

    public void dispose()
    {
        try
        {
            in.close();
            Print.print("dispose() successful");
        }
        catch (IOException e)
        {
            throw new RuntimeException("in.close() failed");
        }
    }
}

