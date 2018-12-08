
package com.xxl.core.strings_13;

import java.util.Random;

import com.xxl.util.Print;

public class UsingStringBuilder
{
    public static Random rand = new Random(47);

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++)
        {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args)
    {
        UsingStringBuilder usb = new UsingStringBuilder();
        Print.print(usb);
    }
}

