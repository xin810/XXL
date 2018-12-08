
package com.xxl.core.exceptions_12;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.xxl.util.Print;

class WrapCheckedException
{
    void throwRuntimeException(int type)
    {
        try
        {
            switch (type)
            {
                case 0 : throw new FileNotFoundException();
                case 1 : throw new IOException();
                case 2 : throw new RuntimeException("Where am I?");
                default : return;
            }
        }
        catch (Exception e)
        {
            // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {}

/**
 * 被检查异常---不检查异常<br>
 * <一句话功能简述>
 * <功能详细描述>
 * @author Administrator
 * @version [1.0.0, Administrator]
 */
public class TurnOffChecking
{
    public static void main(String[] args)
    {
        WrapCheckedException wce = new WrapCheckedException();

        // You can call throwRuntimeException() without a try block,
        //and let RuntimeExceptions leave the method:
        wce.throwRuntimeException(3);

        // Or you can choose to catch exceptions:
        for (int i = 0; i < 4; i++)
        {
            try
            {
                if (i < 3)
                {
                    wce.throwRuntimeException(i);
                }
                else
                {
                    throw new SomeOtherException();
                }
            }
            catch (SomeOtherException e)
            {
                Print.print("SomeOtherException: " + e);
            }
            catch (RuntimeException re)
            {
                try
                {
                    throw re.getCause();
                }
                catch (FileNotFoundException e)
                {
                    Print.print("FileNotFoundException: " + e);
                }
                catch (IOException e)
                {
                    Print.print("IOException: " + e);
                }
                catch (Throwable e)
                {
                    Print.print("Throwable: " + e);
                }
            }
        }
    }
}

